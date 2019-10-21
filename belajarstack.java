public class belajarstack {
    private String data[];
    private int Size;
    private int Top;

    public belajarstack (int kapasitas){
        Size = kapasitas;
        Top = -1;
        data = new String [Size];


    }

    public boolean isEmpty(){
        return Top==-1;

    }
    public boolean isFull(){
        return Top == Size-1;
    }
    public void push (String input){
        if(isFull()){
            System.out.println("lemari telah penuh");
        } else {
            data[++Top]= input;
            System.out.println(input+ " dimasukkan ke dalam lemari");


        }

    }
    public void pop () {
        if(isEmpty()){
            System.out.println("lemari Kosong");
        } else {

            String temp = data[Top];
            data[Top]= data[Top--];
            System.out.println(temp+ " dikeluarkan dari dalam lemari");

        }
    }

    public void infoStack(){
        System.out.println("pakaian yang tersisa dalam lemari : ");
        for(int i =0; i<=Top;i++){

            System.out.println("*" +data[i]);
        }






        }

    public static void main(String[] args) {
        belajarstack s = new belajarstack(10);
        s.push("kaos");
        s.push("cardigan");
        s.push("celana");
        s.pop();
        s.pop();
        System.out.println("");
        s.infoStack();
    }
    }

