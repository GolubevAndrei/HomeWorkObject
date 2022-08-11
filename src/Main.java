public class Main {
    public static void main(String[] args) {
        Book soledad = new Book("Габриэль", "Гарсиа Маркес", "Сто лет одиночества", 1967);
        Book WhiteCompany = new Book("Артур Конан", "Дойл", "Белый отряд", 1891);
        System.out.println("soledad = " + soledad.getBookName() + " " + soledad.getAuthorName() + " " + soledad.getBookYear());
        System.out.println("WhiteCompany = " + WhiteCompany.getBookName() + " " + WhiteCompany.getAuthorName() + " " + WhiteCompany.getBookYear());
        soledad.setBookYear(1984);
        System.out.println("soledad = " + soledad.getBookName() + " " + soledad.getAuthorName() + " " + soledad.getBookYear());
    }
}