VERSION 5.00
Object = "{22D6F304-B0F6-11D0-94AB-0080C74C7E95}#1.0#0"; "msdxm.ocx"
Begin VB.Form frmflyman 
   BackColor       =   &H00C0C0C0&
   BorderStyle     =   1  'Fixed Single
   Caption         =   "Flyman"
   ClientHeight    =   6360
   ClientLeft      =   1485
   ClientTop       =   1710
   ClientWidth     =   8700
   Icon            =   "Flyman~1.frx":0000
   LinkTopic       =   "Form1"
   ScaleHeight     =   6360
   ScaleWidth      =   8700
   StartUpPosition =   2  'CenterScreen
   Begin VB.Timer tmrtiroesquerda 
      Left            =   1080
      Top             =   5280
   End
   Begin VB.PictureBox picfundo 
      Appearance      =   0  'Flat
      BackColor       =   &H0000FF00&
      ForeColor       =   &H80000008&
      Height          =   5199
      Left            =   120
      ScaleHeight     =   5175
      ScaleWidth      =   8415
      TabIndex        =   0
      Top             =   0
      Width           =   8438
      Begin VB.Image imgtiro2 
         Height          =   240
         Left            =   720
         Picture         =   "Flyman~1.frx":0442
         Top             =   480
         Visible         =   0   'False
         Width           =   660
      End
      Begin VB.Image ImgRobo 
         Height          =   630
         Left            =   0
         Picture         =   "Flyman~1.frx":0CC4
         Top             =   3840
         Width           =   660
      End
      Begin VB.Image Imgtiro 
         Height          =   240
         Left            =   600
         Picture         =   "Flyman~1.frx":183E
         Top             =   0
         Visible         =   0   'False
         Width           =   660
      End
      Begin VB.Image ImgBola 
         Height          =   495
         Left            =   7320
         Top             =   4440
         Width           =   1215
      End
   End
   Begin VB.Timer tmrMoveBola 
      Interval        =   1
      Left            =   600
      Top             =   5280
   End
   Begin VB.Timer tmrMoveTiro 
      Left            =   120
      Top             =   5280
   End
   Begin MediaPlayerCtl.MediaPlayer MediaPlayer2 
      Height          =   735
      Left            =   0
      TabIndex        =   3
      Top             =   0
      Visible         =   0   'False
      Width           =   735
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
   Begin MediaPlayerCtl.MediaPlayer MediaPlayer1 
      Height          =   855
      Left            =   2160
      TabIndex        =   2
      Top             =   1440
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
   Begin VB.Label lblteclas 
      Caption         =   "Para mover o robo, use as setas. Para disparar, use  a tecla ""M"" para disparar para a direita, para a esquerda, use a tecla ""N""."
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   8.25
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   1800
      TabIndex        =   1
      Top             =   5400
      Width           =   4935
   End
   Begin VB.Menu mnujogo 
      Caption         =   "&Novo Jogo"
   End
End
Attribute VB_Name = "frmflyman"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Dim X As Integer 'MsgBox de vitróia
Dim c As Integer 'MsgBox de vitória
Dim z As Integer 'MsgBox de derrota
Private Function colisao(imgA As Image, imgb As Image) As Integer
    'Verificar se há colisão
    Dim a As trect
    Dim b As trect
    Dim resultrect As trect
    
    'Guarda a informação para a estrutura trect
    
    a.left = imgA.left
    a.top = imgA.top
    b.left = imgb.left
    b.top = imgb.top
    
    'Calcular o ponto direito e o inferior
    
    a.right = a.left + imgA.Width - 1
    a.bottom = a.top + imgA.Height - 1
    
    b.right = b.left + imgb.Width - 1
    b.bottom = b.top + imgb.Height - 1
    
    colisao = IntersectRect(resultrect, a, b)
End Function
Private Sub Form_Load()
    'Coloca a figura do Robo no jogo
    ImgRobo.Picture = LoadPicture(App.Path & "\1.bmp")
    'Coloca a Figura da Bola no jogo
    imgbola.Picture = LoadPicture(App.Path & "\bola.bmp")
    
End Sub

Private Sub Form_Unload(Cancel As Integer)
    frmjogos.Show
End Sub

Private Sub mnujogo_Click()
    'Coloca a bola na posição Inicial
    imgbola.top = 4440
    imgbola.left = 7320
    
    'Coloca o Robo na posição Inicial
    ImgRobo.top = 3840
    ImgRobo.left = 0
    
    'Esconde o Tiro e move para fora da área do jogo
    Imgtiro.top = -1300
    Imgtiro.left = -1300
    Imgtiro.Enabled = False
    Imgtiro.Visible = False
    
    'Activa timer
    tmrMoveBola.Interval = 10
    
    
End Sub

Private Sub picfundo_KeyDown(KeyCode As Integer, Shift As Integer)
  Static figura 'os passos do robo para a direita
  Static esquerda ' os passos do robo para a esquerda
  
    'Move para a direita
    
    If KeyCode = vbKeyRight Then
        ImgRobo.left = ImgRobo.left + 100
        If figura = 0 Then figura = 1 ' Para começar na 1ª imagem
        ImgRobo.Picture = LoadPicture(App.Path & "\direita\" & figura & ".Bmp")
         If figura = 9 Then figura = 1 'Para quando chegar à ultima imagem, voltar à 1ª
            figura = figura + 1 'Para ir mudando de imagem
            
            
        'Move o Robo para a esquerda
        
        ElseIf KeyCode = vbKeyLeft Then
                ImgRobo.left = ImgRobo.left - 100
                If esquerda = 0 Then esquerda = 1
                ImgRobo.Picture = LoadPicture(App.Path & "\esquerda\" & esquerda & ".Bmp ")
                If esquerda = 9 Then esquerda = 1
                    esquerda = esquerda + 1
                    
        'Disparar para a direita
        ElseIf KeyCode = vbKeyM Then
            ImgRobo.Picture = LoadPicture(App.Path & "\direita\1.bmp") 'Para o robo ficar na mesma direcção  do tiro
            Imgtiro.top = ImgRobo.top
            Imgtiro.left = ImgRobo.left + 640 'Para saír da arma
            tmrMoveTiro.Interval = 50
            tmrMoveTiro.Enabled = True
            Imgtiro.Visible = True
            
                
        'Disparar para a esquerda
        
        ElseIf KeyCode = vbKeyN Then
            ImgRobo.Picture = LoadPicture(App.Path & "\esquerda\1.bmp")
            imgtiro2.top = ImgRobo.top
            imgtiro2.left = ImgRobo.left - 640
            tmrtiroesquerda.Interval = 50
            tmrtiroesquerda.Enabled = True
            imgtiro2.Visible = True
            
        'Movimento para cima
        ElseIf KeyCode = vbKeyUp Then
            ImgRobo.Picture = LoadPicture(App.Path & "\Robo Voando.bmp")
            ImgRobo.top = ImgRobo.top - 100
        
        'Movimento para baixo
        ElseIf KeyCode = vbKeyDown Then
            ImgRobo.Picture = LoadPicture(App.Path & "\Robo Voando.bmp")
            ImgRobo.top = ImgRobo.top + 100
        End If
        
            
End Sub


Private Sub tmrMoveBola_Timer()
    'Move a bola
    Static subindo As Boolean
    Static esquerda As Boolean
    'Faz descer a bola
    If subindo = True Then
        imgbola.top = imgbola.top - 100
        If imgbola.top <= 0 Then
            subindo = False
            Exit Sub
        End If
        ElseIf subindo = False Then
            imgbola.top = imgbola.top + 100
            If imgbola.top >= 5020 Then
                subindo = True
                Exit Sub
            End If
        End If
        
        
        If esquerda = True Then
            imgbola.left = imgbola.left - 100
            If imgbola.left <= 0 Then
                esquerda = False
                Exit Sub
            End If
           ElseIf esquerda = False Then
                imgbola.left = imgbola.left + 100
                If imgbola.left >= 8300 Then
                    esquerda = True
                    Exit Sub
                End If
         End If
       
    
    
        If colisao(ImgRobo, imgbola) Then
            MediaPlayer2.Open (App.Path & "\Oh!!.wav")
            
            tmrMoveBola.Enabled = False
            Imgtiro.Visible = False
            imgtiro2.Visible = False
            tmrMoveTiro.Enabled = False
            tmrtiroesquerda.Enabled = False
            MsgBox "Perdeu o jogo", vbExclamation, "Game Over"
            z = MsgBox("Quer jogar outra vez?", vbYesNo + vbQuestion, "Game Over")
            If z = vbYes Then
                ImgRobo.top = 3840
                ImgRobo.left = 0
                imgbola.top = 4440
                imgbola.left = 7320
                tmrMoveBola.Enabled = True
            Else
                Unload Me
                frmjogos.Show
            End If
        End If

    
End Sub
Private Sub tmrMoveTiro_Timer()
    If Imgtiro.left >= Me.ScaleWidth Then
        tmrMoveTiro = 0
    End If
    Imgtiro.left = Imgtiro.left + 200
    If colisao(Imgtiro, imgbola) Then
        MediaPlayer1.Open (App.Path & "\explusão.wav")
        tmrMoveBola.Enabled = False
        tmrMoveTiro.Enabled = False
        Imgtiro.Visible = False
        MsgBox "Ganhou o jogo!", vbExclamation, "Game Over"
        X = MsgBox("Quer jogador outra vez?", vbYesNo + vbQuestion, "Game Over")
        
        If X = 6 Then
            ImgRobo.top = 3840
            ImgRobo.left = 0
            imgbola.top = 4440
            imgbola.left = 7320
            tmrMoveBola.Enabled = True
            
        Else
            Unload Me
            frmjogos.Show
        End If
    End If
    
End Sub
Private Sub tmrtiroesquerda_Timer()
     If imgtiro2.left >= Me.ScaleWidth Then
        tmrtiroesquerda.Interval = 0
    End If
    imgtiro2.left = imgtiro2.left - 200
    If colisao(imgtiro2, imgbola) Then
        MediaPlayer1.Open (App.Path & "\explusão.wav")
        tmrMoveBola.Enabled = False
        tmrtiroesquerda.Enabled = False
        Imgtiro.Visible = False
        imgtiro2.Visible = False
        tmrMoveTiro.Enabled = False
        MsgBox "Ganhou o jogo", vbOKOnly, "Game Over"
        c = MsgBox("Quer joga outra vez", vbYesNo + vbExclamation, "Game Over")
        If c = 6 Then
            ImgRobo.top = 3840
            ImgRobo.left = 0
            imgbola.top = 4440
            imgbola.left = 7320
            tmrMoveBola.Enabled = True
        Else
            Unload Me
            frmjogos.Show
        End If
    End If
End Sub
