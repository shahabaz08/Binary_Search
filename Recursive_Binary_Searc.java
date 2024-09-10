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

    public int Binary(int key, int left, int right) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            if (Arr[mid] == key) {
                return mid;
            }

            if (Arr[mid] < key) {
                return Binary(key, left, mid + 1);
            }
            if (Arr[mid] > key) {
                return Binary(key, mid - 1, right);
            }
        }
        return -1;
    }
}
class Recursive_Binary_Search {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Size of an array");
        int iSize = sobj.nextInt();
        Binary b = new Binary(iSize);
        b.Accept();
        b.Display();
        System.out.println("Enter the key to find:");
        int key = sobj.nextInt();

        int iRet = b.Binary(key, 0, iSize);
        if (iRet != -1) {
            System.out.print("Key found at index " + iRet);
        } else {
            System.out.print("Key found at Index:" + iRet);
        }
    }
}

echo "# binary_Search" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/shahabaz08/Binary_Search.git
git push -u origin main