// Lista de caminhos dos vídeos
const videoPaths = [
    '../../assets/media/praia.mp4',
    '../../assets/media/CACHOEIRA.mp4',
    '../../assets/media/SOL.mp4'
  ];
  
  // Referências ao elemento de vídeo e ao <source>
  const videoPlayer = document.getElementById('video-player');
  const videoSource = document.getElementById('video-source');
  const source = document.querySelector('.video-source');
  
  // Índice atual do vídeo
  let currentIndex = 0;
  
  // Função para trocar o vídeo
  function changeVideo() {
    currentIndex++;
    if (currentIndex >= videoPaths.length) {
      currentIndex = 0; // Volta ao primeiro vídeo
    }
    source.style.transform = `translateX(-${currentIndex * 300}px)`;
    videoSource.src = videoPaths[currentIndex];
    videoPlayer.load(); // Recarrega o vídeo para aplicar a mudança
    videoPlayer.play();
  }
  
  // Muda o vídeo a cada 5 segundos
  setInterval(changeVideo,5000);
  