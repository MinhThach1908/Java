package ulti;

public class Calculator {
    public static float tinhChuViTamGiac(float a, float b, float c) {
        return a + b + c;
    }

    public static float tinhTong(float num1, float num2) {
        return num1 + num2;
    }

    public static float tinhHieu(float num1, float num2) {
        return num1 - num2;
    }

    public static float tinhNhan(float num1, float num2) {
        return num1 * num2;
    }

    public static float tinhChia(float num1, float num2) {
        if (num2 == 0) {
            System.out.println("Không thể chia cho 0.");
            return 0;
        } else {
            return num1 / num2;
        }
    }
}
