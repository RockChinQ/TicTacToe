; 脚本由 Inno Setup 脚本向导 生成！
; 有关创建 Inno Setup 脚本文件的详细资料请查阅帮助文档！

#define MyAppName "TicTacToe"
#define MyAppVersion "1.5"
#define MyAppPublisher "秦骏言"
#define MyAppExeName "井字棋.jar"

[Setup]
; 注: AppId的值为单独标识该应用程序。
; 不要为其他安装程序使用相同的AppId值。
; (生成新的GUID，点击 工具|在IDE中生成GUID。)
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
Source: "I:\计算机\Java\myprograms\2017\TicTacToe\TicTacToeSetup\TicTacToe\井字棋.jar"; DestDir: "{app}"; Flags: ignoreversion
Source: "I:\计算机\Java\myprograms\2017\TicTacToe\TicTacToeSetup\TicTacToe\g2.ico"; DestDir: "{app}"; Flags: ignoreversion
Source: "I:\计算机\Java\myprograms\2017\TicTacToe\TicTacToeSetup\TicTacToe\lan.txt"; DestDir: "{app}"; Flags: ignoreversion
Source: "I:\计算机\Java\myprograms\2017\TicTacToe\TicTacToeSetup\TicTacToe\met.txt"; DestDir: "{app}"; Flags: ignoreversion
Source: "I:\计算机\Java\myprograms\2017\TicTacToe\TicTacToeSetup\TicTacToe\record.txt"; DestDir: "{app}"; Flags: ignoreversion
Source: "I:\计算机\Java\myprograms\2017\TicTacToe\TicTacToeSetup\TicTacToe\c\*"; DestDir: "{app}"; Flags: ignoreversion recursesubdirs createallsubdirs
Source: "I:\计算机\Java\myprograms\2017\TicTacToe\TicTacToeSetup\TicTacToe\e\*"; DestDir: "{app}"; Flags: ignoreversion recursesubdirs createallsubdirs
; 注意: 不要在任何共享系统文件上使用“Flags: ignoreversion”

[Icons]
Name: "{commonprograms}\{#MyAppName}"; Filename: "{app}\{#MyAppExeName}"
Name: "{commondesktop}\{#MyAppName}"; Filename: "{app}\{#MyAppExeName}"; Tasks: desktopicon
Name: "{userappdata}\Microsoft\Internet Explorer\Quick Launch\{#MyAppName}"; Filename: "{app}\{#MyAppExeName}"; Tasks: quicklaunchicon

[Run]
Filename: "{app}\{#MyAppExeName}"; Description: "{cm:LaunchProgram,{#StringChange(MyAppName, '&', '&&')}}"; Flags: shellexec postinstall skipifsilent

