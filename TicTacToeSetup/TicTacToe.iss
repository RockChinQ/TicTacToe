; �ű��� Inno Setup �ű��� ���ɣ�
; �йش��� Inno Setup �ű��ļ�����ϸ��������İ����ĵ���

#define MyAppName "TicTacToe"
#define MyAppVersion "1.5"
#define MyAppPublisher "�ؿ���"
#define MyAppExeName "������.jar"

[Setup]
; ע: AppId��ֵΪ������ʶ��Ӧ�ó���
; ��ҪΪ������װ����ʹ����ͬ��AppIdֵ��
; (�����µ�GUID����� ����|��IDE������GUID��)
AppId={{3BF3FB7F-D373-4DCD-8EE1-936421D74477}
AppName={#MyAppName}
AppVersion={#MyAppVersion}
;AppVerName={#MyAppName} {#MyAppVersion}
AppPublisher={#MyAppPublisher}
DefaultDirName={pf}\{#MyAppName}
DisableProgramGroupPage=yes
OutputBaseFilename=setup
Compression=lzma
SolidCompression=yes

[Languages]
Name: "chinesesimp"; MessagesFile: "compiler:Default.isl"

[Tasks]
Name: "desktopicon"; Description: "{cm:CreateDesktopIcon}"; GroupDescription: "{cm:AdditionalIcons}"; Flags: unchecked; OnlyBelowVersion: 0,6.1
Name: "quicklaunchicon"; Description: "{cm:CreateQuickLaunchIcon}"; GroupDescription: "{cm:AdditionalIcons}"; Flags: unchecked

[Files]
Source: "I:\�����\Java\myprograms\2017\TicTacToe\TicTacToeSetup\TicTacToe\������.jar"; DestDir: "{app}"; Flags: ignoreversion
Source: "I:\�����\Java\myprograms\2017\TicTacToe\TicTacToeSetup\TicTacToe\g2.ico"; DestDir: "{app}"; Flags: ignoreversion
Source: "I:\�����\Java\myprograms\2017\TicTacToe\TicTacToeSetup\TicTacToe\lan.txt"; DestDir: "{app}"; Flags: ignoreversion
Source: "I:\�����\Java\myprograms\2017\TicTacToe\TicTacToeSetup\TicTacToe\met.txt"; DestDir: "{app}"; Flags: ignoreversion
Source: "I:\�����\Java\myprograms\2017\TicTacToe\TicTacToeSetup\TicTacToe\record.txt"; DestDir: "{app}"; Flags: ignoreversion
Source: "I:\�����\Java\myprograms\2017\TicTacToe\TicTacToeSetup\TicTacToe\c\*"; DestDir: "{app}"; Flags: ignoreversion recursesubdirs createallsubdirs
Source: "I:\�����\Java\myprograms\2017\TicTacToe\TicTacToeSetup\TicTacToe\e\*"; DestDir: "{app}"; Flags: ignoreversion recursesubdirs createallsubdirs
; ע��: ��Ҫ���κι���ϵͳ�ļ���ʹ�á�Flags: ignoreversion��

[Icons]
Name: "{commonprograms}\{#MyAppName}"; Filename: "{app}\{#MyAppExeName}"
Name: "{commondesktop}\{#MyAppName}"; Filename: "{app}\{#MyAppExeName}"; Tasks: desktopicon
Name: "{userappdata}\Microsoft\Internet Explorer\Quick Launch\{#MyAppName}"; Filename: "{app}\{#MyAppExeName}"; Tasks: quicklaunchicon

[Run]
Filename: "{app}\{#MyAppExeName}"; Description: "{cm:LaunchProgram,{#StringChange(MyAppName, '&', '&&')}}"; Flags: shellexec postinstall skipifsilent

