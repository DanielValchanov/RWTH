public abstract sealed class Command permits ListFiles, Exit {
    final VCS vcs;
    public Command(VCS vcs) {
        this.vcs = vcs;

    }
    public VCS returnVcs () {
    return vcs;
    }
    public void execute() {
        // override me!
    }

    public static Command parse(String cmdName, VCS vcs) {
       return switch (cmdName) {
           case "exit" -> new Exit(vcs);
           case "listfiles" -> new ListFiles(vcs);
           case "commit" -> new Commit(vcs);
           default -> {
               System.out.println("Unexpected input.");
               yield null;
           }
        };
    }
}

