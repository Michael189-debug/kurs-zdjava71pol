package stack;

import list.StringLinkedList;

public class StringStack {
    StringLinkedList list = new StringLinkedList();


    public void push (String item){
        list.add(item,0);

    }
    public String pop(){
        String item = list.get(0);
        list.remove(0);
        return item;
    }
    public boolean isEmpty(){
        return list.isEmpty();

    }

}
