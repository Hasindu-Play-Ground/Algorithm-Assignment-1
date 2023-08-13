import java.util.Arrays;

public class Algo_8 {
    public static void main(String[] args) {
        int[] numA = {5, 7, -2, 3, 4, 6, 7};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};

        // Intersection
        int[] intersection = removeDuplicates(intersection(numA, numB));
        System.out.println("Intersection: " + Arrays.toString(intersection));

        // Union
        int[] union = removeDuplicates(union(numA, numB));
        System.out.println("Union: " + Arrays.toString(union));

        // Relative Complement (numA / numB)
        int[] relativeComplementA = removeDuplicates(relativeComplement(numA, numB));
        System.out.println("numA / numB: " + Arrays.toString(relativeComplementA));

        // Relative Complement (numB / numA)
        int[] relativeComplementB = removeDuplicates(relativeComplement(numB, numA));
        System.out.println("numB / numA: " + Arrays.toString(relativeComplementB));

        // Symmetric Difference
        int[] symmetricDifference = removeDuplicates(symmetricDifference(numA, numB));
        System.out.println("Symmetric Difference: " + Arrays.toString(symmetricDifference));
    }

    // Intersection
    public static int[] intersection(int[] arrA, int[] arrB) {
        int[] result = new int[Math.min(arrA.length, arrB.length)];
        int idx = 0;
        for (int num : arrA) {
            if (contains(arrB, num)) {
                result[idx++] = num;
            }
        }
        return Arrays.copyOf(result, idx);
    }

    // Union
    public static int[] union(int[] arrA, int[] arrB) {
        int[] result = new int[arrA.length + arrB.length];
        int idx = 0;
        for (int num : arrA) {
            result[idx++] = num;
        }
        for (int num : arrB) {
            if (!contains(result, num)) {
                result[idx++] = num;
            }
        }
        return Arrays.copyOf(result, idx);
    }

    // Relative Complement
    public static int[] relativeComplement(int[] arrA, int[] arrB) {
        int[] result = new int[arrA.length];
        int idx = 0;
        for (int num : arrA) {
            if (!contains(arrB, num)) {
                result[idx++] = num;
            }
        }
        return Arrays.copyOf(result, idx);
    }

    // Symmetric Difference
    public static int[] symmetricDifference(int[] arrA, int[] arrB) {
        int[] complementA = relativeComplement(arrA, arrB);
        int[] complementB = relativeComplement(arrB, arrA);
        return union(complementA, complementB);
    }

    // check if an element exists in an array
    public static boolean contains(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    // remove duplicates from an array
    public static int[] removeDuplicates(int[] arr) {
        int[] uniqueArr = new int[arr.length];
        int uniqueCount = 0;

        for (int num : arr) {
            if (!contains(uniqueArr, num)) {
                uniqueArr[uniqueCount++] = num;
            }
        }

        return Arrays.copyOf(uniqueArr, uniqueCount);
    }
}

