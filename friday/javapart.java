const friends = [
  {
    name: "Rachel Green",
    img: "https://i.imgur.com/uO9iG1v.jpeg",
    desc: "Fashion enthusiast and all-time coffee lover."
  },
  {
    name: "Monica Geller",
    img: "https://i.imgur.com/4H0rgXJ.jpeg",
    desc: "Chef with a need for cleanliness and order!"
  },
  {
    name: "Joey Tribbiani",
    img: "https://i.imgur.com/Z7bFCtZ.jpeg",
    desc: "Actor. Food lover. And yes — How you doin'?"
  }
];

// Create stars
for (let i = 0; i < friends.length; i++) {
  const star = document.createElement('div');
  star.className = 'star';
  star.style.top = Math.random() * window.innerHeight + 'px';
  star.style.left = Math.random() * window.innerWidth + 'px';
  star.onclick = () => showFriend(i);
  document.body.appendChild(star);
}

function showFriend(index) {
  const friend = friends[index];
  document.getElementById('friendImg').src = friend.img;
  document.getElementById('friendName').textContent = friend.name;
  document.getElementById('friendDesc').textContent = friend.desc;
  document.getElementById('overlay').style.display = 'block';
  document.getElementById('modal').style.display = 'block';
}

function closeModal() {
  document.getElementById('modal').style.display = 'none';
  document.getElementById('overlay').style.display = 'none';
}
