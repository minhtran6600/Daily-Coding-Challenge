public class Solution {
    public String intToRoman(int num)
    {
        char[][] roman = {
            {'I', 'V'},
            {'X', 'L'},
            {'C', 'D'},
            {'M'}
        };

        StringBuilder romanNum = new StringBuilder();
        int len = 0;

        while (num > 0)
        {
            switch (num % 10)
            {
                case 0:
                    break;
                case 1: 
                    romanNum.append(roman[len][0]);
                    break;
                case 2: 
                    romanNum.append(roman[len][0]);
                    romanNum.append(roman[len][0]);
                    break;
                case 3: 
                    romanNum.append(roman[len][0]);
                    romanNum.append(roman[len][0]);
                    romanNum.append(roman[len][0]);
                    break;
                case 4:
                    romanNum.append(roman[len][1]);
                    romanNum.append(roman[len][0]);
                    break;
                case 5:
                    romanNum.append(roman[len][1]);
                    break;
                case 6:
                    romanNum.append(roman[len][0]);
                    romanNum.append(roman[len][1]);
                    break;
                case 7:
                    romanNum.append(roman[len][0]);
                    romanNum.append(roman[len][0]);
                    romanNum.append(roman[len][1]);
                    break;
                case 8:
                    romanNum.append(roman[len][0]);
                    romanNum.append(roman[len][0]);
                    romanNum.append(roman[len][0]);
                    romanNum.append(roman[len][1]);
                    break;
                case 9:
                    romanNum.append(roman[len + 1][0]);
                    romanNum.append(roman[len][0]);
                    break;
            }

            len++;
            num = num / 10;
        }

        return romanNum.reverse().toString();
    }
}