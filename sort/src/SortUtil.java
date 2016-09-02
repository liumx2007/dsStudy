/**
 * 各种排序算法实现
 */
public class SortUtil {

    // 待排序数据
    static int[] array = {49,38,65,97,76,13,27,49};

    private void print(final int[] array, int i, int curItem) {

        System.out.print("["+i+"]"+curItem+":");
        for(int n : array) {
            System.out.print(n+ " ");

        }
        System.out.println("");
    }

    /**
     * 直接插入排序法
     * @param array 待排序数据
     * @return 排好序的数据
     */
    public int[] directInsertOrder (final int[] array) {
        // 存放当前项
        int curItem;
        // 假定第一个数据已经排好序，第二个开始为待排序数据
        for(int i=1;i<array.length;i++) {
            curItem = array[i];
            int j = i - 1;
            // 从前一个开始，将比当前项大的数据依次往后移。
            for(;j>=0 && array[j]>curItem;j--) {
                array[j+1] = array[j];
            }
            // 找到比当前项小的数据，则将当前项插在其后面
            array[j+1] = curItem;
            print(array, i, curItem);
        }

        return array;
    }


    /**
     * 直接插入排序法
     * @param array 待排序数组
     * @return 排序好的数据
     */
    public int[] halfInsertOrder (final int[] array) {
        // 存放当前项
        int curItem;
        // 假定第一个数据已经排好序，第二个开始为待排序数据
        for(int i=1;i<array.length;i++) {
            curItem = array[i];
            int low=0;
            int high=i-1;

            while(low<=high) {
                int j = (high+low)/2;
                if(array[j]>=curItem) {
////                    int m = high;
////                    while(m>j)
//                    for(int m=high;m>j;m--) {
//                        array[m]=array[m-1];
//                    }
//                    if(j==low) {
//                        array[j]=curItem;
//                        break;
//                    }
//                    if(j==low+1 && array[low] <= curItem) {
//                        array[j] = curItem;
//                        break;
//                    }
                    //if(j==low) break;
                    high=j-1;
                } else {
//                    if(high == j+1) break;
                    low=j+1;
                }
            }
            System.arraycopy(array, high + 1, array, high + 1 + 1, i - (high + 1));
            array[high+1]=curItem;

//            // 从前一个开始，将比当前项大的数据依次往后移。
//            for(;j>=0 && array[j]>curItem;j--) {
//                array[j+1] = array[j];
//            }
            // 找到比当前项小的数据，则将当前项插在其后面

            print(array, i, curItem);
        }

        return array;
    }

}
