public class ArrayList extends List{
    private int[] array=new int[10];
    @Override

    public void insert (int index,int element)
    {
        if(index<0||index>size)
        {
            System.out.println("下标错误");
        }else{
            for(int i=size;i>index;i--)
            {
                array[i]=array[i-1];
            }
            array[index]=element;
            size++;
        }
    }

}
