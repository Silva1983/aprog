VERSION 5.00
Object = "{22D6F304-B0F6-11D0-94AB-0080C74C7E95}#1.0#0"; "msdxm.ocx"
Begin VB.Form frmprincipal 
   BorderStyle     =   0  'None
   Caption         =   " Ecrã Principal"
   ClientHeight    =   8400
   ClientLeft      =   150
   ClientTop       =   540
   ClientWidth     =   11235
   Icon            =   "Pagina_principal.frx":0000
   LinkTopic       =   "Form1"
   MaxButton       =   0   'False
   Picture         =   "Pagina_principal.frx":0442
   ScaleHeight     =   8400
   ScaleWidth      =   11235
   ShowInTaskbar   =   0   'False
   StartUpPosition =   2  'CenterScreen
   Begin VB.Timer Timer1 
      Interval        =   1500
      Left            =   840
      Top             =   7800
   End
   Begin VB.CommandButton cmdsair 
      Caption         =   "&Sair"
      Height          =   735
      Left            =   9840
      Picture         =   "Pagina_principal.frx":6774
      Style           =   1  'Graphical
      TabIndex        =   0
      Top             =   7200
      Width           =   1215
   End
   Begin MediaPlayerCtl.MediaPlayer MediaPlayer1 
      Height          =   735
      Left            =   9240
      TabIndex        =   6
      Top             =   3360
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
   Begin MediaPlayerCtl.MediaPlayer MediaPlayer2 
      Height          =   975
      Left            =   9240
      TabIndex        =   5
      Top             =   1080
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
   Begin VB.Label lblchamada 
      Alignment       =   2  'Center
      BackColor       =   &H80000006&
      Caption         =   "Joga e diverte-te"
      ForeColor       =   &H000000FF&
      Height          =   255
      Left            =   5400
      TabIndex        =   4
      Top             =   4200
      Width           =   1455
   End
   Begin VB.Label lblgame 
      Alignment       =   2  'Center
      BackColor       =   &H80000006&
      Caption         =   "Jogos"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   -1  'True
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H000000FF&
      Height          =   495
      Left            =   5400
      TabIndex        =   3
      Top             =   3840
      Width           =   1815
   End
   Begin VB.Label lblecra2 
      Alignment       =   2  'Center
      BackColor       =   &H80000012&
      Caption         =   "Ecrã Principal"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   24
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   -1  'True
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H000000FF&
      Height          =   615
      Left            =   0
      TabIndex        =   2
      Top             =   0
      Visible         =   0   'False
      Width           =   10335
   End
   Begin VB.Label lblecra 
      BackColor       =   &H80000006&
      Caption         =   "E       c        r        ã                  P        r         i        n        c         i         p        a         l"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   24
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   -1  'True
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H000000FF&
      Height          =   7935
      Left            =   240
      TabIndex        =   1
      Top             =   0
      Width           =   1815
   End
   Begin VB.Menu mnuprogramas 
      Caption         =   "&Programas"
      Begin VB.Menu mnuword 
         Caption         =   "&Word"
      End
      Begin VB.Menu mnupaint 
         Caption         =   "&Paint"
      End
      Begin VB.Menu mnulinha 
         Caption         =   "-"
      End
      Begin VB.Menu mnusair 
         Caption         =   "&Sair"
      End
   End
   Begin VB.Menu mnurelógio 
      Caption         =   "&Relógio"
   End
   Begin VB.Menu mnuautor 
      Caption         =   "&Autor"
   End
End
Attribute VB_Name = "frmprincipal"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Dim a As Integer
Private Sub cmdsair_Click()
'fecha o programa enviando uma mensagem de aviso
a = MsgBox("Tem a certeza que quer sair do programa?", vbInformation + vbYesNo, "Informação!")
If (a = 6) Then
End
End If
End Sub

Private Sub Form_MouseMove(Button As Integer, Shift As Integer, X As Single, Y As Single)
    lblchamada.ForeColor = &HFF&
    lblgame.ForeColor = &HFF&
End Sub

Private Sub Form_Resize()
MediaPlayer2.Open (App.Path & "\inicio_pagina_principal.wav")
End Sub

Private Sub lblchamada_Click()
'Abre o form jogo da label "jogue e divirta-se"
Unload Me
frmjogos.Show

End Sub

Private Sub lblchamada_MouseMove(Button As Integer, Shift As Integer, X As Single, Y As Single)
    lblgame.ForeColor = &HFF00&
    lblchamada.ForeColor = &HFF00&
End Sub
Private Sub lblgame_Click()
Unload Me
frmjogos.Show
End Sub

Private Sub lblgame_MouseMove(Button As Integer, Shift As Integer, X As Single, Y As Single)
    lblgame.ForeColor = &HFF00&
    lblchamada.ForeColor = &HFF00&
End Sub

Private Sub mnuautor_Click()
'abre o form autor
frmautor.Show
End Sub

Private Sub mnupaint_Click()
    'Abre o programa Desenho
    frmDesenho.Show
    frmprincipal.Hide
End Sub

Private Sub mnurelógio_Click()
'Abre o form relógio
frmrelógio.Show
End Sub

Private Sub mnusair_Click()
'fecha o programa enviando uma mensagem de aviso apartir do menu sair
a = MsgBox("Tem a certeza que quer sair do programa?", vbInformation + vbYesNo, "Informação!")
If (a = 6) Then
End
End If
End Sub

Private Sub mnuword_Click()
    'Abre o word
    frmMain.Show
    frmprincipal.Hide
End Sub

Private Sub Timer1_Timer()
'coloca as label's "ecrã principal" a piscar
If (lblecra2.Visible = True) Then
    lblecra2.Visible = False
    lblecra.Visible = True
Else
   lblecra2.Visible = True
   lblecra.Visible = False
End If
End Sub
