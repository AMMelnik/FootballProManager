package com.edmodo.lection6;

/**
 * Created by pc on 06.12.2016.
 */
public enum League {

    /*RPREMLEAG(1, "RUS Premier League"),
    BUNDES(2, "Bundesliga"),
    EPREMLEAG(3, "EN Premier League"),
    SLELLADA(4, "Super League Ellada"),
    TIPLIG(5, "Tippe Ligaen"),
    LAL(6, "La Liga"),
    ITSERA(7, "Serie A"),
    ERED(8, "Eredivisie"),
    ASM(9, "Ascenso MX");
*/
    RPREMLEAG("RUS Premier League"),
    BUNDES("Bundesliga"),
    EPREMLEAG("EN Premier League"),
    SLELLADA("Super League Ellada"),
    TIPLIG("Tippe Ligaen"),
    LAL("La Liga"),
    ITSERA("Serie A"),
    ERED("Eredivisie"),
    ASM("Ascenso MX");

    // private int id;
    private String leagueName;

    /*  League(int id, String leagueName) {
          this.id = id;
          this.leagueName = leagueName;
      }*/
    League(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getLeagueNameById(int id) {
        String name = new String();
        switch (id) {
            case 1:
                name = League.RPREMLEAG.leagueName;
                break;
            case 2:
                name = League.BUNDES.leagueName;
                break;
            case 3:
                name = League.EPREMLEAG.leagueName;
                break;
        }
        return name;
    }

 /*   public int getId() {
        return id;
    }*/
}
