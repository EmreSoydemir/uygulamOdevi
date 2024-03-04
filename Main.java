
public class Main {
    public static void main(String[] args) {
        String[] ogrenciler= {"Kadir", "Gökhan", "Hakan", "Suzan", "Pınar", "Mehmet", "Ali", "Emel", "Fırat", "James", "Jale", "Ersin", "Deniz", "Gözde", "Anıl", "Burak"};
        int[] ogrenciSureleri = {341, 273, 278, 329, 445, 402, 388, 270, 243, 334, 412, 393, 299, 343, 317, 265};
        int birinci = birinci(ogrenciSureleri);
        int ikinci = ikinci(ogrenciSureleri, birinci );
        int ucuncu = ucuncu(ogrenciSureleri, birinci , ikinci);
        System.out.println("birinci " + ogrenciler[birinci ] +": " + ogrenciSureleri[birinci]);
        System.out.println("ikinci " + ogrenciler[ikinci]+ ": " + ogrenciSureleri[ikinci]);
        System.out.println("üçüncü " + ogrenciler[ucuncu]+ ": " + ogrenciSureleri[ucuncu]);
        int[] siniflar = siniflandir(ogrenciSureleri);
        System.out.println("A: " + siniflar[0]);
        System.out.println("B: " + siniflar[1]);
        System.out.println("C: " + siniflar[2]);
    }
    public static int birinci(int[] sureler) {
        int birinci = 0;
        for (int i = 1; i < sureler.length; i++) {
            if (sureler[i] < sureler[birinci]) {
                birinci= i;
            }
        }
        return birinci;
    }
    public static int ikinci(int[] sureler, int birinci) {
        int ikinci= 0;
        for (int i = 0; i < sureler.length; i++) {
            if (i != birinci && sureler[i] < sureler[ikinci]) {
                ikinci = i;
            }
        }
        return ikinci;
    }
    public static int ucuncu(int[] sureler, int birinci, int ikinci) {
        int ucuncu = 0;
        for (int i = 0; i < sureler.length; i++) {
            if (i != birinci && i != ikinci && sureler[i] < sureler[ucuncu]) {
                ucuncu = i;
            }
        }
        return ucuncu;
    }
    public static int[] siniflandir(int[] sureler) {
        int[] gruplar = new int[3];
        for (int sure : sureler) {
            if (sure >= 200 && sure <= 299) {
                gruplar[0]++;
            } else if (sure >= 300 && sure <= 399) {
                gruplar[1]++;
            } else {
                gruplar[2]++;
            }
        }
        return gruplar;
    }
}
