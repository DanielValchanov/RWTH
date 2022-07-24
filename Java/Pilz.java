//TODO a) Record-Klasse Pilz
public record Pilz(Pilzart art, boolean reif){
    public static Pilz[] pilzlichtung(){
        Pilzart[] pilzarten = Pilzart.values();
        Pilz[] res = new Pilz[pilzarten.length];
        for (int i = 0; i < pilzarten.length; ++i){
            res[i] = new Pilz(pilzarten[i], true);
        }
        return res;
    }
    public static int anzahlUnreif(Pilz[] pilze){
        int res = 0;
        for(Pilz pilz : pilze){
            if(pilz == null || !pilz.reif())
                res++;
        }
        return res;
    }
}
