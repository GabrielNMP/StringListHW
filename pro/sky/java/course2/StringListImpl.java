package pro.sky.java.course2;

import java.util.Objects;

public class StringListImpl implements StringList {

    private static final int INITIAL_SIZE = 15;
    private String[] data;
    private int capacity;

    public StringListImpl() {
        data = new String[INITIAL_SIZE];
    }

    public StringListImpl(int n){
        if (n<=0) {
            throw new IllegalArgumentException("Размер массива должен больше ноля . ");
        }
        data = new String[n];
        capacity = 0;
    }


    @Override
    public String add(String item) {
        if(Objects.isNull(item)){
            throw new IllegalArgumentException("Нельзя добавлять null в список ");
        }
        if(capacity < data.length) {
            data[capacity++] = item;
            return item;
        }
        throw new IllegalArgumentException("Список полон");
    }

    @Override
    public String add(int index, String item) {
        if(Objects.isNull(item)){
            throw new IllegalArgumentException("Нельзя добавлять null в список ");
        }
        if(index < 0){
            throw new IllegalArgumentException("индекс элемента должен быть больше ноля ");
        }
        if(index>INITIAL_SIZE){
            throw new IllegalArgumentException(" Индекс больше возможного ");
        }
        if (capacity >= data.length){
            throw new IllegalArgumentException("Список полон.");
        }
        for (int i = capacity; i> index; i--){
            data[i]=data[i -1];
        }
        return data[index]=item;
    }

    @Override
    public String set(int index, String item) {
        if(Objects.isNull(item)){
            throw new IllegalArgumentException("Нельзя добавлять null в список ");
        }
        if(index < 0){
            throw new IllegalArgumentException("индекс элемента должен быть больше ноля ");
        }
        if(index>INITIAL_SIZE){
            throw new IllegalArgumentException(" Индекс больше возможного ");
        }
        data[index] = item;
        return null;
    }

    @Override
    public String remove(String item) {
        if(Objects.isNull(item)){
            throw new IllegalArgumentException("Нельзя добавлять null в список ");
        }
        int indexForRemoving = -1;
        for (int i=0; i< capacity; i++){
            if (data[i].equals(item)){
                indexForRemoving = i;
                break;
            }
        }
        if (indexForRemoving == -1){
            throw new IllegalArgumentException("Нет такого элемента в массиве строк ");
        }
        return remove(indexForRemoving);
    }

    @Override
    public String remove(int index) {
        if(index < 0){
            throw new IllegalArgumentException("индекс элемента должен быть больше ноля ");
        }
        if(index>INITIAL_SIZE){
            throw new IllegalArgumentException(" Индекс больше возможного ");
        }
        if (index>=capacity){
            throw new IllegalArgumentException("Индекс меньше количества элементов");
        }
        String removed = data[index];
        for (int i=index; i< capacity; i++){
            data[i] = data[i+1];
            }
        data[--capacity]= null;
        return removed;
    }

    @Override
    public boolean contains(String item) {
        if(Objects.isNull(item)){
            throw new IllegalArgumentException("Нельзя проверять null в списке ");
        }
        for (int i=0; i< capacity; i++){
            if (data[i].equals(item))
                return true;
            }
        return false;
    }

    @Override
    public int indexOf(String item) {
        if(Objects.isNull(item)){
            throw new IllegalArgumentException("Нельзя проверять null в списке ");
        }
        int index = -1;
        for (int i=0; i< capacity; i++){
            if (data[i].equals(item)){
                index=i;
                break;
            }
        }
        return index;
    }

    @Override
    public int lastIndexOf(String item) {
        if(Objects.isNull(item)){
            throw new IllegalArgumentException("Нельзя проверять null в списке ");
        }
        int index = -1;
        for (int i=capacity-1; i>-0; i--){
            if (data[i].equals(item)){
                index=i;
                break;
            }
        }
        return index;
    }

    @Override
    public String get(int index) {
        if(index < 0){
            throw new IllegalArgumentException("индекс элемента должен быть больше ноля ");
        }
        if(index>INITIAL_SIZE){
            throw new IllegalArgumentException(" Индекс больше возможного ");
        }
        if (index>=capacity){
            throw new IllegalArgumentException("Индекс меньше количества элементов");
        }
        return data[index];
    }

    @Override
    public boolean equals(StringList otherList) {
        if (size() != otherList.size()) {
            return false;
        }
        for (int i= 0; i<capacity; i++){
            if(!data[i].equals(otherList.get(i))){
                return false;
            }
        }
        return true;
    }

    @Override
    public int size() {
        return capacity;
    }

    @Override
    public boolean isEmpty() {
        return size() ==0;
    }

    @Override
    public void clear() {
        for (int i= 0; i<capacity; i++){
            data[i] = null;
        }
        capacity = 0;
    }

    @Override
    public String[] toArray() {
        String[] result = new String[capacity];
        for (int i= 0; i<capacity; i++){
            result[i] = data[i];
        }
        return result;
    }
}
