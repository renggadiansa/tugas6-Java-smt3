public class Library {
    private String name;
    private int totalBooks;
    private int borrowedBooks;

    public Library(String name, int totalBooks) {
        this.name = name;
        this.totalBooks = totalBooks;
        this.borrowedBooks = 0;
    }

    public void borrowBook(int count) {
        if (count > (totalBooks - borrowedBooks)) {
            System.out.println("Tidak cukup buku yang tersedia untuk dipinjam.");
        } else {
            borrowedBooks += count;
            System.out.println(count + " buku dipinjam dari perpustakaan " + name + ".");
        }
    }

    public void returnBook(int count) {
        if (count > borrowedBooks) {
            System.out.println("Jumlah buku yang dikembalikan lebih dari yang dipinjam.");
        } else {
            borrowedBooks -= count;
            System.out.println(count + " buku dikembalikan ke perpustakaan " + name + ".");
        }
    }

    public int availableBooks() {
        return totalBooks - borrowedBooks;
    }

    public void printDetails() {
        System.out.println(name);
        System.out.println("Total Buku: " + totalBooks);
        System.out.println("Buku yang dipinjam: " + borrowedBooks);
        System.out.println("Buku yang tersedia: " + availableBooks());
    }
}
