VERSION 5.00
Object = "{22D6F304-B0F6-11D0-94AB-0080C74C7E95}#1.0#0"; "msdxm.ocx"
Begin VB.Form frmjogos 
   BackColor       =   &H0000FF00&
   Caption         =   "Ecrã de Jogos "
   ClientHeight    =   8475
   ClientLeft      =   60
   ClientTop       =   345
   ClientWidth     =   10680
   Icon            =   "frmjogos.frx":0000
   LinkTopic       =   "Form1"
   MaxButton       =   0   'False
   ScaleHeight     =   8475
   ScaleWidth      =   10680
   StartUpPosition =   2  'CenterScreen
   Begin VB.PictureBox picrobo2 
      Appearance      =   0  'Flat
      BackColor       =   &H0000FF00&
      BorderStyle     =   0  'None
      ForeColor       =   &H80000008&
      Height          =   975
      Left            =   120
      ScaleHeight     =   975
      ScaleWidth      =   975
      TabIndex        =   6
      Top             =   7200
      Width           =   975
   End
   Begin VB.CommandButton cmdsair 
      BackColor       =   &H00C0FFC0&
      Caption         =   "&Sair"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   1335
      Left            =   4680
      MaskColor       =   &H00E0E0E0&
      Picture         =   "frmjogos.frx":0442
      Style           =   1  'Graphical
      TabIndex        =   5
      Top             =   5520
      Width           =   1335
   End
   Begin VB.Timer trmrobo 
      Interval        =   100
      Left            =   9840
      Top             =   7800
   End
   Begin VB.PictureBox picrobo 
      AutoSize        =   -1  'True
      BorderStyle     =   0  'None
      Height          =   735
      Left            =   10800
      ScaleHeight     =   735
      ScaleWidth      =   855
      TabIndex        =   4
      Top             =   240
      Width           =   855
   End
   Begin VB.CommandButton cmdArkanoyd 
      BackColor       =   &H0000FF00&
      Caption         =   "Arkanoyd"
      Height          =   975
      Left            =   6480
      Picture         =   "frmjogos.frx":1886
      Style           =   1  'Graphical
      TabIndex        =   3
      Top             =   4320
      Width           =   1455
   End
   Begin VB.CommandButton cmddikfly 
      BackColor       =   &H0000FF00&
      Caption         =   "Disk Fly"
      Height          =   975
      Left            =   2400
      Picture         =   "frmjogos.frx":6830
      Style           =   1  'Graphical
      TabIndex        =   2
      Top             =   4320
      Width           =   1455
   End
   Begin VB.CommandButton cmdvelhooeste 
      BackColor       =   &H0000FF00&
      Caption         =   "Velho oeste"
      Height          =   975
      Left            =   6480
      Picture         =   "frmjogos.frx":B2B2
      Style           =   1  'Graphical
      TabIndex        =   1
      Top             =   2640
      Width           =   1455
   End
   Begin VB.CommandButton cmdmanfly 
      BackColor       =   &H0000FF00&
      Caption         =   "FlyMan"
      Height          =   975
      Left            =   2400
      MaskColor       =   &H8000000A&
      Picture         =   "frmjogos.frx":BF9C
      Style           =   1  'Graphical
      TabIndex        =   0
      Top             =   2640
      Width           =   1455
   End
   Begin VB.Label lblnome 
      Alignment       =   2  'Center
      BackColor       =   &H0000FF00&
      Caption         =   "Ecrã de jogos"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   18
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00FF0000&
      Height          =   1095
      Left            =   3480
      TabIndex        =   8
      Top             =   3840
      Width           =   3375
   End
   Begin MediaPlayerCtl.MediaPlayer MediaPlayer1 
      Height          =   855
      Left            =   9240
      TabIndex        =   7
      Top             =   3480
      Visible         =   0   'False
      Width           =   1215
      AudioStream     =   -1
      AutoSize        =   0   'False
      AutoStart       =   -1  'True
      AnimationAtStart=   -1  'True
      AllowScan       =   -1  'True
      AllowChangeDisplaySize=   -1  'True
      AutoRewind      =   0   'False
      Balance         =   0
      BaseURL         =   ""
      BufferingTime   =   5
      CaptioningID    =   ""
      ClickToPlay     =   -1  'True
      CursorType      =   0
      CurrentPosition =   -1
      CurrentMarker   =   0
      DefaultFrame    =   ""
      DisplayBackColor=   0
      DisplayForeColor=   16777215
      DisplayMode     =   0
      DisplaySize     =   4
      Enabled         =   -1  'True
      EnableContextMenu=   -1  'True
      EnablePositionControls=   -1  'True
      EnableFullScreenControls=   0   'False
      EnableTracker   =   -1  'True
      Filename        =   ""
      InvokeURLs      =   -1  'True
      Language        =   -1
      Mute            =   0   'False
      PlayCount       =   1
      PreviewMode     =   0   'False
      Rate            =   1
      SAMILang        =   ""
      SAMIStyle       =   ""
      SAMIFileName    =   ""
      SelectionStart  =   -1
      SelectionEnd    =   -1
      SendOpenStateChangeEvents=   -1  'True
      SendWarningEvents=   -1  'True
      SendErrorEvents =   -1  'True
      SendKeyboardEvents=   0   'False
      SendMouseClickEvents=   0   'False
      SendMouseMoveEvents=   0   'False
      SendPlayStateChangeEvents=   -1  'True
      ShowCaptioning  =   0   'False
      ShowControls    =   -1  'True
      ShowAudioControls=   -1  'True
      ShowDisplay     =   0   'False
      ShowGotoBar     =   0   'False
      ShowPositionControls=   -1  'True
      ShowStatusBar   =   0   'False
      ShowTracker     =   -1  'True
      TransparentAtStart=   0   'False
      VideoBorderWidth=   0
      VideoBorderColor=   0
      VideoBorder3D   =   0   'False
      Volume          =   -600
      WindowlessVideo =   0   'False
   End
End
Attribute VB_Name = "frmjogos"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub cmdArkanoyd_Click()
Unload Me
Unload frmprincipal
frmArkanoyd.Show
End Sub

Private Sub cmddikfly_Click()
Unload Me
Unload frmprincipal
frmDiskFly.Show
End Sub

Private Sub cmdmanfly_Click()
Unload Me
Unload frmprincipal
frmflyman.Show
End Sub

Private Sub cmdsair_Click()
Unload Me
frmprincipal.Show
End Sub

Private Sub cmdvelhooeste_Click()
Unload Me
Unload frmprincipal
frmvelho_oeste.Show
End Sub

Private Sub Form_Load()
MediaPlayer1.Open (App.Path & "\ent_jogos.mid")
End Sub

Private Sub Form_Unload(Cancel As Integer)
frmprincipal.Show
End Sub

Private Sub trmrobo_Timer()
Static figura
Static figura2

'########Movimenta para a esquerda o robo que está na parte de cima do form########
     If figura = 0 Then figura = 1
        picrobo.Picture = LoadPicture(App.Path & "\esquerda\" & figura & ".bmp")
        picrobo.Move picrobo.left - 50
        If figura = 9 Then figura = 1
        figura = figura + 1
     
     If (picrobo.left <= -720) Then
        picrobo.left = 10800
        If figura = 0 Then figura = 1
        picrobo.Picture = LoadPicture(App.Path & "\esquerda\" & figura & ".bmp")
        picrobo.Move picrobo.left - 50
        If figura = 9 Then figura = 1
        figura = figura + 1
     End If
'######## Fim de Movimentar o robo que está na parte de cima do form ########

'########Movimenta para a direita o robo que está na parte de baixo do form########
     
     If figura2 = 0 Then figura2 = 1
        picrobo2.Picture = LoadPicture(App.Path & "\direita\" & figura2 & ".bmp")
        picrobo2.Move picrobo2.left + 50
         If figura2 = 9 Then figura2 = 1
          figura2 = figura2 + 1
    
    ' Faz o boneco recomeçar a caminhada
     
     If (picrobo2.left >= 10800) Then
        picrobo2.left = -720
        If figura2 = 0 Then figura2 = 1
        picrobo2.Picture = LoadPicture(App.Path & "\direita\" & figura2 & ".bmp")
        picrobo2.Move picrobo2.left + 50
        If figura2 = 9 Then figura2 = 1
        figura2 = figura2 + 1
     End If
'######## Fim de Movimentar o robo que está na parte de baixo do form ########

End Sub
