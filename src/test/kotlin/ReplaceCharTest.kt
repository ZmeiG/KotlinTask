import org.junit.Assert.assertEquals
import org.junit.Test

class ReplaceCharTest {

    @Test
    fun simpleByStringApi() {
        val repChar = ReplaceChar()
        assertEquals("MustBeString", repChar.simpleByStringApi("MustBeWString", 'W'))

    }

    @Test
    fun simpleByStringApiNUll() {
        val repChar = ReplaceChar()
        assertEquals("", repChar.simpleByStringApi(null, 'W'))

    }

    @Test
    fun simpleByStringApiEmpty() {
        val repChar = ReplaceChar()
        assertEquals("", repChar.simpleByStringApi("", 'W'))

    }
}