package com.houkai.d1≥Ã–Ú≤ÈÀ„∑®;

enum AccountType
{
    SAVING, FIXED, CURRENT;
    private AccountType()
    {
        System.out.println("It is a account type");
    }
}
class EnumOne
{
	final float a = 9.08f;
    public static void main(String[]args)
    {
        System.out.println(AccountType.FIXED);
    }
   
}
