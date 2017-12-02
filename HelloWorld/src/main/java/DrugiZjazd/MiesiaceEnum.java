package DrugiZjazd;

public enum MiesiaceEnum {
    STYCZEN("zima"),
    LUTY("zima"),
    MARZEC("wiosna"),
    KWIECIEN("wiosna"),
    MAJ("wiosna"),
    CZERWIEC("lato"),
    LIPIEC("lato"),
    SIERPIEN("lato"),
    WRZESIEN("jesien"),
    PAZDZIERNIK("jesien"),
    LISTOPAD("jesien"),
    GRUDZIEN("zima");

    final String poraRoku;

    MiesiaceEnum(String poraRoku) {
        this.poraRoku = poraRoku;
    }

    }

