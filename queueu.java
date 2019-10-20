public class queueu {
    private int head;
    private int tail;
    private int size;
    private String data[];

    public queueu (int kapasitas){
        head=-1;
        tail=-1;
        size = kapasitas;
        data = new String[size];
    }

    public  boolean isEmpty (){
        return head ==-1;
    }

    public boolean isFull (){
        return tail >= size-1;
    }

    public void add (String input) {
        if(isEmpty()){
            data[++head] = input;
            tail++;
            System.out.println("Data " +input+ " telah dimasukkan ke queue");
        } else {
            if(isFull()){
                System.out.println("Queue Telah Penuh");
            } else {
                data[++tail] = input;
            }
        }
        System.out.println("Data " +input+ " Telah Dimasukkan ke dalam Queue");
    }

    public void remove (){
        if(isEmpty()){
            System.out.println("Queue Kosong");
        } else {
            String temp = data[head];
            for (int i =0; i<tail; i++){
                data[i]= data[i+1];
            }
            tail--;
            System.out.println("Data " +temp+ " telah dihapus dari queue");
        }
    }

    public void infoQueue (){
        for (int i =0; i<=tail; i++){
            System.out.println("Data " +i+ " = " +data[i]);
        }
    }

    public static void main(String[] args) {
        queueu a = new queueu(5);
        a.add("aku");
        a.add("cinta");
        a.add("ngoding");
        a.add("selama");
        a.add("nya");
        a.infoQueue();
        a.remove();
        a.remove();
        a.infoQueue();

    }
    }



