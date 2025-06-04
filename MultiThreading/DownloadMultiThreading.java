package MultiThreading;

public class DownloadMultiThreading {
    public static void main(String[] args) {
        FileDownload obj = new FileDownload();
        System.out.println("\n\nWithout Using MultiThreading \n\n");
        obj.Download("File A");
        obj.Download("File B");
        System.out.println("\n\nBy Using MultiThreading \n\n");
        FileDownloadWithThread t1 = new FileDownloadWithThread("File A");
        FileDownloadWithThread t2 = new FileDownloadWithThread("File B");
        t1.start();
        t2.start();
    }
}
class FileDownload{

    public void Download(String file)
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(file + "  downloading.........   " + (i*20)+"%");
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        }
        System.out.println(file + " Done");
    }
        
    }
    class FileDownloadWithThread extends Thread{
        String FileName;
        FileDownloadWithThread(String FileName){
            this.FileName=FileName;
        }

    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(FileName + "  downloading.........   " + (i*20)+"%");
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        }
        System.out.println(FileName + " Done");
    }
        
    }

