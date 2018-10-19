class ReplaceChar{

    fun simpleByStringApi(string: String?, ch: Char) : String {

        if(string == null || string.isEmpty()) return ""

        var res = ""
        for (c in string) {
            if(c != ch) res = res.plus(c)
        }
        return res
    }

}