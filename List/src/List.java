public class List {

    protected  int size;
    protected  int[] array;
    public List()
    {
        array=new int [20];
        size=0;
    }
    public void insert( int index,int element)

    {
        System.out.println("无法使用");
    }
    public void pushFront(int element)
    {
        insert(0, element);
    }
    public void pushBack(int element) {
        insert(size, element);
    }
}
