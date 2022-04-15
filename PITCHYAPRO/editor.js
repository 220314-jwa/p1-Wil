getStories();

let pitchyaproUrl='http://localhost:8081'


async function getStories() {
    let response=await fetch(pitchyaproUrl, +'stories')


if ( response.status===200){
    let stories=await response.json();
    console.log(stories);
    showStories(stories);
}

}
function getStoriesAjax(){
 let xhr=new XMLHttpRequest();
 xhr.onreadystatechange=getData;
 xhr.open('GET', pitchyaproUrl + 'stories');
 xhr.send();
   
 function getData() {
 if(xhr.readyState===4){
     if (xhr.status===200){
         let response=xhr.responseText;
         let stories=JSON.parse(response);
         showStories(stories);
     }
 }
 } 
}

function showStories(stories){
    let storyTable=document.getElementById('storyTable');
    storyTable.innerHTML=`<tr>
    <tr>   
    <th>id</th>
    <th>author</th>
    <th>editor</th>
    <th>genre</th>
    <th>title</th>
    <th>description</th>
    <th>storyLength</th> 
    <th><button>approve</button>
    <button>pending</button>
    <button>rejected</button></th> 
  </tr>`;


for ( let story of stories){
    let rowForStory=document.createElement('tr');

    for (let field in story) {
     let column= document.createElement('td');
     if (field !=='status'){
         column.innerText=pet[field];
     } else {
         column.innerHTML=`<button id="review ${story.id}">Pending</button>`;
     }
     rowForStory.appendChild(column);

    }
    storyTable.appendChild(rowForStory);
}
}