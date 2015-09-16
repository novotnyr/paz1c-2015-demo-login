package sk.upjs.ics.login;

public class Prihlasovanie {
    public boolean prihlas(String login, String heslo) {
        return false;
    }
    
    public static void main(String[] args) {
        Prihlasovanie prihlasovanie = new Prihlasovanie();
        boolean vysledok = prihlasovanie.prihlas("igor", "nbusr123");
        System.out.println(vysledok);
    }
}
