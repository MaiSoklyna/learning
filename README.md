body {
  display: flex;
  justify-content: center;
  align-items: center;
  min-width: 100vh;
  background: linear-gradient(to right, #bd2b4f, #4ec3d8, rgb(231, 160, 138));
}
.contanier {
  margin: auto;
  display: flex;
  flex-direction: column;
  align-items: center;
}
button {
  padding: 1rem;
  background-color: skyblue;
}
#coin {
  position: relative;
  width: 15rem;
  height: 15rem;
  margin: 2rem 0rem;
}
#coin div {
  width: 100%;
  height: 100%;
  border: 2px solid black;
  border-radius: 50%;
  backface-visibility: hidden;
  background-size: contain;
  position: absolute;
}
.headsClass {
  background-image: url("https://www.kundanrefinery.com/pub/media/catalog/product/cache/a6819a77997e6f5ec84977f1af72369f/k/r/kr337-a_1.jpg");
}
.animate_heads {
  animation: flipHeads 3s;
  animation-fill-mode: forwards;
}
@keyframes flipHeads {
  from {
    transform: rotateY(0deg);
  }
  to {
    transform: rotateY(1800deg);
  }
}
.tailsClass {
  background-image: url("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT_Hxr1aT1ebxVS3wqHHX33AN9cTTyklWEnAu3zYOJCy7v8YVGXZ-FXXl4C05TfcYtDCxY&usqp=CAU");
  transform: rotateY(-180deg);
}
.animate_heads {
  animation: flipTails 3s;
  animation-fill-mode: forwards;
}
@keyframes flipTails {
  from {
    transform: rotateY(0deg);
  }
  to {
    transform: rotateY(1620deg);
  }
}
