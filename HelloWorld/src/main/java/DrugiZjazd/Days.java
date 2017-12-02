package DrugiZjazd;

public enum Days {
    MONDAY(1, true),
    TUESTDAY(2, true),
    WEDNESDAY(3, true),
    THURSDAY(4, true),
    FRIDAY(5, true),
    SATURDAY(6, false),
    SUNDAY(7, false);

    final int dzienTygodnia;
    final boolean roboczy;

    Days(int dzienTygodnia, boolean roboczy){
        this.dzienTygodnia = dzienTygodnia;
        this.roboczy = roboczy;
    }
}

