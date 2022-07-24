public record Karte(Farbe farbe, Wert wert){

    String toString1(){
        String ganzeKarte;
        ganzeKarte=(farbe.toString()+wert.toString());
        return ganzeKarte;
    }

    public static Karte neueKarte(Farbe f, Wert w){
        Karte karte=new Karte(f,w);
        return karte;
    }
    public static Karte neueKarte(String f, String w){
        Karte stringKarte=new Karte(Farbe.valueOf(f), Wert.valueOf(w));
        return stringKarte;
    }
    public static int kombinationen(){
        int kombination;
        int alleFarbe=Farbe.values().length;
        int alleWerte=Wert.values().length;
        return alleFarbe*alleWerte;
        
    }

    public static Karte[] skattblatt(){
        Karte[] alleKom=new Karte[Karte.kombinationen()];
        for(int i=0;i<Farbe.values().length;i++){
            for(int y=0;y<Wert.values().length;y++){
                alleKom[i]= new Karte(Farbe.values()[i],Wert.values()[y]);
                
                
                
            }

            
        }
        return alleKom;

    }
    boolean bedient(Karte other){
          if(this.farbe==other.farbe||this.wert==other.wert){
              return true;
          }
            else return false;
          } 


     boolean bedienbar(Karte... kn){
        boolean gleich=false;
         for(Karte karte:kn){
             
             if(this.bedient(karte)){
                 gleich=true;
             }

         }
            return gleich;
     }

    public static void druckeDoppelBedingungen(){
        Karte [] skattblatt=Karte.skattblatt();
        for(Karte karte:skattblatt){
            for(Karte karte2:skattblatt){
                if(!karte.equals(karte2)){
                    if(karte.bedient(karte2)){
                        System.out.println(karte.toString1() + " bedient " + karte2.toString1()+ " und "+ karte2.toString1() + " bedient " + karte.toString1());
                    }

                }

            }
        }
    }


    
             
}
       

    
 

