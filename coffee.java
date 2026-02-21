public class coffee {
    public static void main(String[] args) {
        enum c{
            small(100),
            medium(200),
            large(300);
            int qty;
            c(int q){
                this.qty=q;
            }
            void show_q(){
                System.out.println(qty);
            }
        }
        c c1=c.large;
        c1.show_q();

    }
}
