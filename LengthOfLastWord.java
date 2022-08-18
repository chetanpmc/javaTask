class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ')
            --i;
        final int lastIndex = i;
        while (i >= 0 && s.charAt(i) != ' ')
            --i;
        return lastIndex - i;
    }
    public static void main(String[] args)
    {
        LengthOfLastWord lword =new LengthOfLastWord();
        int a = lword.lengthOfLastWord("fly me  to the  moon");
        System.out.println("Length Of Last Word="+a);
    }
}
