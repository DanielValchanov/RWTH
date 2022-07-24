import java.io.File;

public final class Commit extends ListFiles implements Modifying{
    public Commit (VCS vcs) {
        super(vcs);
    }
    public void execute() {

        final String newDir =vcs.getBackupDir()+File.separator+Util.getTimestamp();
        final String backUp = vcs.getBackupDir();
        Util.mkdir(newDir);

        if(Util.listFiles(vcs.getBackupDir()).length>0) {
            for(String file : Util.listFiles(vcs.getBackupDir()))
                Util.moveFile(vcs.getBackupDir()+File.separator+file, newDir+File.separator+file);
        }
        for (String file : Util.listFiles(vcs.getRootDir()))
            Util.copyFile(vcs.getRootDir()+File.separator+file, backUp+File.separator+file);
        System.out.println("Committed the following files");
        super.execute();
    }

    @Override
    public String getInformation() {
        return "This command does the following modifying operations:\nFiles: Copy and Move\nDirectory: " +
                this.returnVcs().getRootDir();


    }
}
