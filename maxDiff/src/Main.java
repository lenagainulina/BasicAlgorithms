/*
На  одной  из  планет  год  разделен  на  4  сезона:  winter,  spring,  summer  и  autumn,  которые
наступают  в  указанном  порядке.  В  году  N  дней  и  каждый  сезон  длится  ровно  N/4  дней.
Год  начинается  с  первого  дня  зимы  и  заканчивается  последним  днем  осени.
Даны  результаты  измерений  температур  за  предыдущий  год,  нужно  найти  сезон  с
наибольшим  колебанием  температур.  Колебания  это  разница  между  самой  высокой  и
самой  низкой  температурой  в  указанном  сезона.  Предполагается,  что  все  сезоны  одного
года  имеют  разные  колебания  температур.

Напишите  функцию:

class  Solution  {  public  String  solution(int[]  T);  }

где  в  данном  массиве  T  из  N  целых  чисел  указаны  температуры  всех  дней  в  году,
возвратит  строку  с  названием  сезона,  в  котором  колебания  были  самыми  большими  (то
есть  одно  из  следующих:  "WINTER",  "SPRING",  "SUMMER",  "AUTUMN").

Допустим,  дано  T  =  [−3,  −14,  −5,  7,  8,  42,  8,  3]:
функция  должна  вернуть  "SUMMER",  так  как  наибольшое  колебание  (34)  произошло
летом.

Дано  T  =  [2,  −3,  3,  1,  10,  8,  2,  5,  13,  −5,  3,  −18]:
правильный  ответ  "AUTUMN"  (колебание  равно  21).

Предполагайте,  что:

● Количество  элементов  в  массиве  кратно  4;

● Каждый  элемент  массива  T  целое  число  в  промежутке  [−1,000..1,000];

● N  целое  число  в  промежутке  [8..200];

●  Колебания  во  всех  сезонах  различаются
 */


public class Main {
    public static void main(String[] args) {
        int[] T = {-3, -14, -5, 7, 8, 42, 8, 3};

        System.out.println(solution(T));
    }

    public static String solution(int[] T) {

        int min = T[0];
        int max = T[0];
        int p = T.length / 4;
        int winter = 0;
        int spring = 0;
        int summer = 0;
        int fall = 0;

        for (int i = 0; i < p; i++) {

            if (min > T[i]) {
                min = T[i];
            }

            if (max < T[i]) {
                max = T[i];
            }
            winter = max - min;
        }
        for (int i = p; i < p * 2; i++) {

            if (min > T[i]) {
                min = T[i];
            }

            if (max < T[i]) {
                max = T[i];
            }
            spring = max - min;
        }

        for (int i = p * 2; i < p * 3; i++) {

            if (min > T[i]) {
                min = T[i];
            }

            if (max < T[i]) {
                max = T[i];
            }
            summer = max - min;
        }

        for (int i = p * 3; i < p * 4; i++) {

            if (min > T[i]) {
                min = T[i];
            }

            if (max < T[i]) {
                max = T[i];
            }
            fall = max - min;
        }

        int maxDiff = Math.max(winter, Math.max(spring, Math.max(summer, fall)));

        String result = "";

        if (maxDiff == winter) {
            result = "WINTER";
        } else if (maxDiff == spring) {
            result = "SPRING";
        } else if (maxDiff == summer) {
            result = "SUMMER";
        } else if (maxDiff == fall) {
            result = "FALL";
        }

        return result;
    }

}
