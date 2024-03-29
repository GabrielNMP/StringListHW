package pro.sky.java.course2;

public interface StringList {
    // ���������� ��������.
    // ������� ����������� �������
    // � �������� ���������� ����������.
    String add(String item);

    // ���������� ��������
    // �� ������������ ������� ������.
    // ���� ������� �� ������� ������������
    // ���������� ��������� ��� �������,
    // ��������� ����������.
    // ������� ����������� �������
    // � �������� ���������� ����������.
    String add(int index, String item);

    // ���������� �������
    // �� ������������ �������,
    // ������� ������������.
    // ��������� ����������,
    // ���� ������ ������
    // ������������ ���������� ���������
    // ��� ������� �� ������� �������.
    String set(int index, String item);

    // �������� ��������.
    // ������� ��������� �������
    // ��� ����������, ���� ��������
    // ������� ����������� � ������.
    String remove(String item);

    // �������� �������� �� �������.
    // ������� ��������� �������
    // ��� ����������, ���� ��������
    // ������� ����������� � ������.
    String remove(int index);

    // �������� �� ������������� ��������.
    // ������� true/false;
    boolean contains(String item);

    // ����� ��������.
    // ������� ������ ��������
    // ��� -1 � ������ ����������.
    int indexOf(String item);

    // ����� �������� � �����.
    // ������� ������ ��������
    // ��� -1 � ������ ����������.
    int lastIndexOf(String item);

    // �������� ������� �� �������.
    // ������� ������� ��� ����������,
    // ���� ������� �� ����� ������������
    // ���������� ���������.
    String get(int index);

    // �������� ������� ������ � ������.
    // ������� true/false ��� ����������,
    // ���� ������� null.
    boolean equals(StringList otherList);

    // ������� ����������� ���������� ���������.
    int size();

    // ������� true,
    // ���� ��������� � ������ ���,
    // ����� false.
    boolean isEmpty();

    // ������� ��� �������� �� ������.
    void clear();

    // ������� ����� ������
    // �� ����� � ������
    // � ������� ���.
    String[] toArray();
}
