package assignment0920;

import java.util.Arrays;
import java.util.concurrent.*;

public class Sum {
    Integer[] arr = {23, 85, 92, 61, 57, 0, 35, 55, 49, 59, 29, 67, 40, 43, 16, 48, 60, 11, 89, 90, 0, 79, 39, 19, 21, 8, 65, 87, 10, 77, 34, 45, 75, 32, 28, 64, 78, 63, 54, 46, 31, 50, 68, 96, 5, 80, 62, 69, 91, 22, 97, 95, 0, 74, 58, 71, 44, 87, 33, 12, 22, 95, 66, 3, 56, 73, 81, 38, 26, 70, 98, 94, 4, 72, 13, 15, 93, 24, 51, 6, 82, 41, 27, 9, 76, 52, 53, 25, 17, 36, 82, 59, 20, 18, 37, 2, 47, 30, 83, 84, 63, 7, 42, 1, 88, 14, 99, 39, 73, 26, 12, 83, 94, 26, 83, 72, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 66, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 44, 85, 92, 61, 57, 0, 35, 55, 49, 59, 29, 67, 40, 43, 16, 48, 60, 11, 89, 90, 0, 79, 39, 19, 21, 8, 65, 87, 10, 77, 34, 45, 75, 32, 28, 64, 78, 63, 54, 46, 31, 50, 68, 96, 5, 80, 62, 69, 91, 22, 97, 95, 0, 74, 58, 71, 44, 87, 33, 12, 22, 95, 66, 3, 56, 73, 81, 38, 26, 70, 98, 94, 4, 72, 13, 15, 93, 24, 51, 6, 82, 41, 27, 9, 76, 52, 53, 25, 17, 36, 82, 59, 20, 18, 37, 2, 47, 30, 83, 84, 63, 7, 42, 1, 88, 14, 99, 39, 73, 26, 12, 83, 94, 26, 83, 72, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 66, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 44, 85, 92, 61, 57, 0, 35, 55, 49, 59, 29, 67, 40, 43, 16, 48, 60, 11, 89, 90, 0, 79, 39, 19, 21, 8, 65, 87, 10, 77, 34, 45, 75, 32, 28, 64, 78, 63, 54, 46, 31, 50, 68, 96, 5, 80, 62, 69, 91, 22, 97, 95, 0, 74, 58, 71, 44, 87, 33, 12, 22, 95, 66, 3, 56, 73, 81, 38, 26, 70, 98, 94, 4, 72, 13, 15, 93, 24, 51, 6, 82, 41, 27, 9, 76, 52, 53, 25, 17, 36, 82, 59, 20, 18, 37, 2, 47, 30, 83, 84, 63, 7, 42, 1, 88, 14, 99, 39, 73, 26, 12, 83, 94, 26, 83, 72, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 66, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 44, 85, 92, 61, 57, 0, 35, 55, 49, 59, 29, 67, 40, 43, 16, 48, 60, 11, 89, 90, 0, 79, 39, 19, 21, 8, 65, 87, 10, 77, 34, 45, 75, 32, 28, 64, 78, 63, 54, 46, 31, 50, 68, 96, 5, 80, 62, 69, 91, 22, 97, 95, 0, 74, 58, 71, 44, 87, 33, 12, 22, 95, 66, 3, 56, 73, 81, 38, 26, 70, 98, 94, 4, 72, 13, 15, 93, 24, 51, 6, 82, 41, 27, 9, 76, 52, 53, 25, 17, 36, 82, 59, 20, 18, 37, 2, 47, 30, 83, 84, 63, 7, 42, 1, 88, 14, 99, 39, 73, 26, 12, 83, 94, 26, 83, 72, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 66, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 44, 85, 92, 61, 57, 0, 35, 55, 49, 59, 29, 67, 40, 43, 16, 48, 60, 11, 89, 90, 0, 79, 39, 19, 21, 8, 65, 87, 10, 77, 34, 45, 75, 32, 28, 64, 78, 63, 54, 46, 31, 50, 68, 96, 5, 80, 62, 69, 91, 22, 97, 95, 0, 74, 58, 71, 44, 87, 33, 12, 22, 95, 66, 3, 56, 73, 81, 38, 26, 70, 98, 94, 4, 72, 13, 15, 93, 24, 51, 6, 82, 41, 27, 9, 76, 52, 53, 25, 17, 36, 82, 59, 20, 18, 37, 2, 47, 30, 83, 84, 63, 7, 42, 1, 88, 14, 99, 39, 73, 26, 12, 83, 94, 26, 83, 72, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 66, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 26, 91, 72, 13, 39, 63, 14, 91, 27, 69, 12, 33, 46, 23, 57, 75, 90, 61, 38, 29, 66, 71, 13, 39, 26, 72, 91, 62, 23, 71, 39, 29, 44};

    public static void main(String[] args) {
        Sum obj = new Sum();
/*        int sum = 0;
        for (int i = 0; i < obj.arr.length; i++) {
            sum += obj.arr[i];
        }
        System.out.println(sum);//248288,main线程测试结果*/

        ThreadPoolExecutor tpe = new ThreadPoolExecutor(8, 16, 10, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(1000));
        int finalSum = 0;
        Integer[] temp = obj.arr;
//        Integer[] subArr1 = Arrays.copyOfRange(obj.arr, 0, temp.length / 3);
//        Integer[] subArr2 = Arrays.copyOfRange(obj.arr, temp.length / 3, temp.length / 3 * 2);
//        Integer[] subArr3 = Arrays.copyOfRange(obj.arr, temp.length / 3 * 2, temp.length);
//        Future<Integer> f1 = tpe.submit(new myCallable(subArr1));
//        Future<Integer> f2 = tpe.submit(new myCallable(subArr2));
//        Future<Integer> f3 = tpe.submit(new myCallable(subArr3));


/*        try {
            finalSum += f1.get();
            finalSum += f2.get();
            finalSum += f3.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }*/

        //这是第二种做法，使用循环建立线程，比上一种直接分割好的更厉害
        for (int i = 0; i < temp.length; i += 3) {
            Integer[] arr = Arrays.copyOf(temp, Math.min(3, temp.length - i));
            myCallable my = new myCallable(arr);
            Future<Integer> fu = new FutureTask(my);
            tpe.submit(my);

            try {
                finalSum += fu.get();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }


        System.out.println(finalSum);

        tpe.shutdown();
    }
}

class myCallable implements Callable<Integer> {
    Integer[] arr;
    int sum = 0;

    public myCallable(Integer[] arr) {
        this.arr = arr;
    }

    @Override
    public Integer call() throws Exception {
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }
}