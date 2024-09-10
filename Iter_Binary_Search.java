import java.util.*;

class Binary {
    private int Arr[];
    int iSize;

    Binary(int iSize) {
        this.Arr = new int[iSize];
        this.iSize = iSize;
    }

    public void Accept() {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Plz enter the arry in sorted manner");
        System.out.println("Enter the elements :");
        for (int i = 0; i < iSize; i++) {
            Arr[i] = sobj.nextInt();
        }
    }

    public void Display() {
        System.out.println("Array Elements are:");
        for (int i = 0; i < iSize; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println();
    }

    public int Binary(int key) {

        int left = 0, right = iSize - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (Arr[mid] == key) {
                return mid;
            } else if (Arr[mid] < key) {
                left = mid + 1;
            } else if (Arr[mid] > key) {
                right = mid - 1;
            } else {
                System.out.println("Number not present");
            }
        }
        return 0;
    }

}

class Iter_Binary_Search {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Size of an array");
        int iSize = sobj.nextInt();
        Binary b = new Binary(iSize);
        b.Accept();
        b.Display();
        System.out.println("Enter the key to find:");
        int key = sobj.nextInt();

        int iRet = b.Binary(key);
        System.out.println("Key found at index " + iRet);
    }
}