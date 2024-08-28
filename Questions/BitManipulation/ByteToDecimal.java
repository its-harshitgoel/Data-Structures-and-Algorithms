class ByteToDecimal {
    public static int convertByteToDecimal(String byteStr) {
        /*
         * To find the decimal equivalent of a byte, sum the place values of bits set to
         * 1.
         */

        StringBuilder sb = new StringBuilder();
        for (int i = byteStr.length() - 1; i >= 0; i--) {
            sb.append(byteStr.charAt(i));
        }

        int sum = 0;
        for (int i = 0; i < sb.length(); i++) {
            sum += Math.pow(2, i) * (sb.charAt(i) - '0');
        }

        return sum;
    }

    public static void main(String[] args) {
        String byteStr = "11011011";
        System.out.println(convertByteToDecimal(byteStr));
    }
}