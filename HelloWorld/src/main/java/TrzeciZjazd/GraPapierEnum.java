package TrzeciZjazd;

public enum GraPapierEnum {
    PAPIER {
        @Override
        public int play(GraPapierEnum g) {
            int result = 0;

            switch (g) {
                case KAMIEN:
                    result = 1;
                    break;
                case PAPIER:
                    result = 0;
                    break;
                case NOZYCZKI:
                    result = -1;
            }
            return result;
        }
    },
    KAMIEN{
        @Override
        public int play(GraPapierEnum g) {
            if(g == PAPIER){
                return -1;
            }
            else if(g == NOZYCZKI) {
                return 1;
            }

            return 0;
        }
    },
    NOZYCZKI{
        @Override
        public int play(GraPapierEnum g) {
            if(g == PAPIER) {
                return 1;
            }
            if(g == KAMIEN){
                return -1;
            }

            return 0;
        }
    };

    // - 1 negat, 0 - równe, 1 pozytywne

        public abstract int play(GraPapierEnum g);
    }

//    public final int ordinal(){
//        return ordinal;
//    }

