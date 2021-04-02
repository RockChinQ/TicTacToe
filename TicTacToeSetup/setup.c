#include <stdio.h>
#include <stdlib.h>
int main()
{
	system("echo off");
	printf("TicTacToe  井字棋AI 安装程序\n==============================\n验证Java运行环境.....");
	FILE *del=fopen("test.txt","w");
    fclose(del);
    system("Java -jar jet.jar");
    FILE *re=fopen("test.txt","r");
	char ch=' ';
    fscanf(re,"%c",&ch);
    fclose(re);
    if(ch!='s'){
		printf("Fail\n");
        printf("正在安装Java环境.....");
        system("chromeinstall-8u60.exe");
        printf("[done]");
    }else{
		printf("[done]\n");
    }
    system("pause");
	return 0;
}
