#include <stdio.h>
#include <stdlib.h>
int main()
{
	system("echo off");
	printf("TicTacToe  ������AI ��װ����\n==============================\n��֤Java���л���.....");
	FILE *del=fopen("test.txt","w");
    fclose(del);
    system("Java -jar jet.jar");
    FILE *re=fopen("test.txt","r");
	char ch=' ';
    fscanf(re,"%c",&ch);
    fclose(re);
    if(ch!='s'){
		printf("Fail\n");
        printf("���ڰ�װJava����.....");
        system("chromeinstall-8u60.exe");
        printf("[done]");
    }else{
		printf("[done]\n");
    }
    system("pause");
	return 0;
}
