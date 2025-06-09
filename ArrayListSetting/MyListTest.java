package ArrayListSetting;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();

        // Thêm phần tử vào danh sách
        list.add(0, 1);
        list.add(1, 2);
        list.add(2, 3);

        // Hiển thị các phần tử
        System.out.println("Size: " + list.size());
        System.out.println("Element at index 1: " + list.get(1));

        // Kiểm tra phương thức contains
        System.out.println("Contains 2? " + list.contains(2));

        // Xóa phần tử tại index 1
        list.remove(1);
        System.out.println("After removing element at index 1:");
        System.out.println("Size: " + list.size());
        System.out.println("Contains 2? " + list.contains(2));

        // Xóa tất cả phần tử
        list.clear();
        System.out.println("After clearing, size: " + list.size());
    }
}
