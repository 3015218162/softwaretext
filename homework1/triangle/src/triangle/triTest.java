package triangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class triTest {

	tri t = new tri();
    @Test
    public void testtriangle() {
    	//��������
        assertEquals(-1, t.triangle(1, 2, 3));
        
        assertEquals(-1, t.triangle(3, 1, 2));
        
        assertEquals(-1, t.triangle(2, 3, 1));
        
        assertEquals(-1, t.triangle(-1, 1, 1));
        
        assertEquals(-1, t.triangle(1, -1, 1));
        
        assertEquals(-1, t.triangle(1, 1, -1));
        
        //�ȱ�
        assertEquals(2, t.triangle(1, 1, 1));
        
        //����
        assertEquals(1, t.triangle(2, 2, 3));
        
        assertEquals(1, t.triangle(2, 3, 3));
        
        assertEquals(1, t.triangle(2, 3, 2));
        
        //��ͨ
        assertEquals(0, t.triangle(2, 3, 4));
    }

}
