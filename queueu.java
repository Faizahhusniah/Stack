public class latihanqueue {
    private int head;
    private int tail;
    private int size;
    private String data[];

    public latihanqueue (int kapasitas){
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

        } else {
            if(isFull()){
                System.out.println("barisan telah penuh, silahkan mengantri disebelah");
            } else {
                data[++tail] = input;
            }
        }
        System.out.println(input+ " dipanggil untuk menyalam guru");
    }

    public void remove (){
        if(isEmpty()){
            System.out.println("siswa kosong");
        } else {
            String temp = data[head];
            for (int i =0; i<tail; i++){
                data[i]= data[i+1];
            }
            tail--;
            System.out.println(temp+ " dipanggil untuk menyalam guru");
        }
    }

    public void infoQueue (){
        System.out.println("siswa yang belum dipanggil");
        for (int i =0; i<=tail; i++){
            System.out.println(i+")"+data[i]);
        }
    }

    public static void main(String[] args) {
        latihanqueue a = new latihanqueue(5);
        a.add("milla");
        a.add("bibah");
        a.add("sabar");
        a.add("indri");
        a.add("nae");
        System.out.println("");
        a.infoQueue();
        System.out.println("");
        a.remove();
        a.remove();
        System.out.println("");
        a.infoQueue();

    }
    }






