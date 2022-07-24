public class Toolbox {
    /**
     *Groesse eines PowerTools
     */
    public static final int PowerToolSize = 3;
    /**
     *
     */
    private Tool[] tools;
    /**
     *
     */
    private int capacity;
    /**
     *
     */
    private String  name;

    /**
     * erzeugt eine neue leere Toolbox
     * @param name Toolboxname
     * @param capacity Toolboxkapazitaet
     */
    public Toolbox (String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.tools = new Tool[capacity];
    }

    /**
     *
     * @param name
     * @param tools
     */
    public Toolbox(String name, Tool... tools){
        this.name = name;
        this.capacity = 0;
        this.tools = tools;
        for(Tool tool: tools){
            if(tool == null){
                this.capacity+=1;
            }
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param i
     * @return Tool an der Stelle i sofern i in Toolbox
     */
    public Tool getTool(int i){
        if(0 <= i && i < this.tools.length){
            return this.tools[i];
        }else{
            return null;
        }
    }

    private boolean checkRoomForTool(Wrapper i){
        i.set(0);
        boolean room = true;
        while (i.get()<=this.tools.length - PowerToolSize){
            for(int j = i.get(); j<i.get() + PowerToolSize; j++){
                if(this.tools[j]!=null){
                    room = false;
                    break;
                }
                room = true;
            }
            if(room){
                return true;
            }
            i.set(i.get() + 1);
        }
        return false;
    }

    public void addTool(Tool t){
        switch(t){
            case PowerTool -> {
                Wrapper i = new Wrapper(0);
                if(this.checkRoomForTool(i)){
                    for(int k = 0; k < PowerToolSize; k++){
                        this.tools[i.get()+k] = t;
                    }
                    this.capacity-= PowerToolSize;
                }
            }
            case Materials -> {
                for(int k = 0; k < this.tools.length; k++){
                    if(this.tools[k] == null){
                        this.tools[k] = t;
                        this.capacity--;
                        break;
                    }
                    if(this.tools[k] == Tool.Materials){
                        break;
                    }

                }
            }
            case SimpleTool -> {
                for(int k = 0; k < this.tools.length; k++){
                    if(this.tools[k] == null){
                        this.tools[k] = t;
                        this.capacity--;
                        break;
                    }
                }
            }
        }
    }
}
