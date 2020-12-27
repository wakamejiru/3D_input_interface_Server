import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.Arrays;
import java.util.UUID;
import java.util.Date;
import javax.bluetooth.LocalDevice;
import javax.bluetooth.ServiceRecord;
import javax.microedition.io.Connector;
import javax.microedition.io.StreamConnection;
import javax.microedition.io.StreamConnectionNotifier;

/**
 * 英大文字変換エコーバック Bluetooth サーバ。
 */
public class RfcommServer {
    /**
     * UUIDは独自プロトコルのサービスの場合は固有に生成する。
     * - 各種ツールで生成する。（ほぼ乱数）
     * - 注：このまま使わないように。
     */
    static final String serverUUID = "ca5df4b852ff9efa0ee1ab72da671932";
    public static String[] selecter_data=new String[1024];
    public static String data=null;
    public static int n=0;
    public StreamConnectionNotifier server = null;

    public RfcommServer() throws IOException {
        // RFCOMMベースのサーバの開始。
        // - btspp:は PRCOMM 用なのでベースプロトコルによって変わる。
        server = (StreamConnectionNotifier) Connector.open(
                "btspp://localhost:" + serverUUID,
                Connector.READ_WRITE, true
        );
        // ローカルデバイスにサービスを登録。必須ではない。
        ServiceRecord record = LocalDevice.getLocalDevice().getRecord(server);
        LocalDevice.getLocalDevice().updateRecord(record);
    }

    /**
     * クライアントからの接続待ち。
     * @return 接続されたたセッションを返す。
     */
    public Session accept() throws IOException {
        log("Accept");
        StreamConnection channel = server.acceptAndOpen();
        log("Connect");
        return new Session(channel);
    }
    public void dispose() {
        log("Dispose");
        if (server  != null) try {server.close();} catch (Exception e) {/*ignore*/}
    }

    /**
     * セッション。
     * - 並列にセッションを晴れるかは試していない。
     * - 基本的に Socket と同じ。
     */
    static class Session implements Runnable {
        private StreamConnection channel = null;
        private InputStream btIn = null;
        private OutputStream btOut = null;

        public Session(StreamConnection channel) throws IOException {
            this.channel = channel;
            this.btIn = channel.openInputStream();
            this.btOut = channel.openOutputStream();
        }

        /**
         * 英小文字の受信データを英大文字にしてエコーバックする。
         * - 入力が空なら終了。
         */
        public void run(){
            Keypress press=new Keypress();
            try {
                byte[] buff = new byte[512];
                //int n = 0;
                int hoge=15;
                int selecter_data_length=0;
                int i=0;
                n = btIn.read(buff);
                System.out.println(n);
                while (true) {
                    n = 0;
                    n = btIn.read(buff);
                    System.out.println(n);
                    data = new String(buff, 0, n);
                    //所定内のデータのみを抽出
                    System.out.println(data);
                    //String[]
                    selecter_data = data.split("#", 0);
                    //System.out.println(selecter_data[0] + "1");
                    //System.out.println(selecter_data[1] + "2");
                    //System.out.println(selecter_data[2] + "3");
                    //System.out.println(selecter_data[3] + "4");
                    //System.out.println(selecter_data[4] + "5");
                    //System.out.println(selecter_data[5] + "6");
                    //System.out.println(selecter_data[6] + "7");
                    //System.out.println(selecter_data[7] + "8");
                    //System.out.println(selecter_data[8] + "9");
                    //System.out.println(selecter_data[9] + "10");
                    //System.out.println(selecter_data[10] + "11");
                    //System.out.println(selecter_data[11] + "12");
                    //0番目と一番最後は実行しない
                    selecter_data_length = selecter_data.length;
                    if (hoge % 15 == 0) {
                        for (i = 1; i < selecter_data_length; i++) {
                            press.press(selecter_data[i]);
                        }
                        hoge++;
                    }
                    //並列処理
                    //if (selecter_data[0] != Previous_data[0]) {
                    //press.press(selecter_data[0]);
                    //}
                    //if(selecter_data[1]!=Previous_data[1]) {
                    //press.press(selecter_data[1]);
                    //}
                    //if(selecter_data[2]!=Previous_data[2]) {
                    //press.press(selecter_data[2]);
                    //}
                    //if(selecter_data[3]!=Previous_data[3]) {
                    //press.press(selecter_data[3]);S
                    //}
                    //if(selecter_data[4]!=Previous_data[4]) {
                    //press.press(selecter_data[4]);
                    //}
                    //if(selecter_data[5]!=Previous_data[5]) {
                    //press.press(selecter_data[5]);
                    //}
                    //if(selecter_data[6]!=Previous_data[6]) {
                    //press.press(selecter_data[6]);
                    //}
                    //if(selecter_data[7]!=Previous_data[7]) {
                    //press.press(selecter_data[7]);
                    //}
                    //if(selecter_data[8]!=Previous_data[8]) {
                    //press.press(selecter_data[8]);
                    //}
                    //if(selecter_data[9]!=Previous_data[9]) {
                    //press.press(selecter_data[9]);
                    //}
                    //if(selecter_data[10]!=Previous_data[10]) {
                    //press.press(selecter_data[10]);
                    //}
                    //if(selecter_data[11]!=Previous_data[11]) {
                    //press.press(selecter_data[11]);
                    //}
                    //press.press(selecter_data[12]);
                    Arrays.fill(selecter_data, null);
                    data = null;
                    System.out.println(data);
                    //Arrays.fill(buff,(byte)0);
                    //System.out.println(buff);
                    n = 0;
                    System.out.println(n);

                    hoge++;
                }
            }
            catch (Throwable t) {
                t.printStackTrace();
            }
        }
        public void close() {
            log("Session Close");
            if (btIn    != null) try {btIn.close();} catch (Exception e) {/*ignore*/}
            if (btOut   != null) try {btOut.close();} catch (Exception e) {/*ignore*/}
            if (channel != null) try {channel.close();} catch (Exception e) {/*ignore*/}
        }
    }

    //------------------------------------------------------
    public static void main(String[] args) throws Exception {
        RfcommServer server = new RfcommServer();
        while (true) {
            Session session = server.accept();
            new Thread(session).start();
        }
        //server.dispose();
    }
    private static void log(String msg) {
        System.out.println("["+(new Date()) + "] " + msg);
    }
}
