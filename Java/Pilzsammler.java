public class Pilzsammler {
  String name;
  Pilz[] korb;
  int anzahl = 0;

  public Pilz[] sammlePilze(Pilz... pilze) {
    int anzahlUnreif = Pilz.anzahlUnreif(pilze);
    int restReifePilze = (pilze.length - anzahlUnreif) - (korb.length-anzahl);
    if (restReifePilze < 0){
      restReifePilze = 0;
    }
    Pilz[] res = new Pilz[restReifePilze + anzahlUnreif];

    int i = 0;
    for(Pilz pilz : pilze){
      if(pilz != null){
        if(hatPlatz() && pilz.reif()){
          System.out.println(name + " sammelt einen " + pilz);
          korb[anzahl] = pilz;
          anzahl++;
        }
        else{
          System.out.println(name + " nimmt " + pilz  + " nicht mit.");
          res[i] = pilz;
          i++;
        }
      }
    }
    return res;
  }

  public boolean hatPlatz() {
    return anzahl < korb.length;
  }

  public void ausgabe() {
    System.out.println(name + "(" + anzahl + "/" + korb.length + "):");
    for(Pilz pilz : korb){
      if(pilz != null){
        System.out.println(pilz);
      }
    }
  }
}
