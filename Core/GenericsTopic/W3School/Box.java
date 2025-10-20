package Core.GenericsTopic.W3School;

class Box<T> {
    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}

// class Box2 {
//     private int content;
//
//     public int getContent() {
//         return content;
//     }
//
//     public void setContent(int content) {
//         this.content = content;
//     }
// }
//
// class Box3 {
//     private String content;
//
//     public String getContent() {
//         return content;
//     }
//
//     public void setContent(String content) {
//         this.content = content;
//     }
// }

class Main{
    static void main() {
        Box strBox = new Box();
        strBox.setContent("testing: string");
        System.out.println(strBox.getContent());

        Box intBox = new Box();
        intBox.setContent(30);
        System.out.println("testing: int");
    }
}
