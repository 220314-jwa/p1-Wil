let loggedInUser;
// checkLogin();
let loginButton = document.getElementById("loginbtn");
loginButton.addEventListener('click',userLogin);

async function userLogin(){
    let credentials = {
        username: document.getElementById('email').value,
        password:document.getElementById('password').value,
        role:document.getElementById('role').value
    };
    console.log(credentials);
    let credentialJSON=JSON.stringify(credentials);
    
    let httpResp = await fetch('http://localhost:8081/login',
    {method:'POST', body:credentialJSON});
if (httpResp && httpResp.status === 200) {
    loggedInUser = await httpResp.json();
    sessionStorage.setItem('Auth-Token', loggedInUser.id);
    console.log("Status"+ httpResp.status);
    // await checkLogin();
  
    location.replace('author.html');
}

}

let submitbutton=document.getElementById("submitbutton");
submitbutton.addEventListener('click', submitAStory)

async function submitAstory() {
    let userId = sessionStorage.getItem('Auth-Token');
    let credentials = {
      author_name:document.getElementById('afullname').value,
      editor_name:document.getElementById('efullname').value,
      title:document.getElementById('title').value,
      genre:document.getElementById('genre').value,
      description:document.getElementById('description').value,
      storyLength:document.getElementById('StoryLength').value,
    };
    console.log(credentials)
    let credentialJSON = JSON.stringify(credentials);
  
    let httpResp = await fetch('http://localhost:8081/SubmitAStory/story',
        {method:'POST', body:credentialJSON});
    if (httpResp && httpResp.status === 200) {
        console.log("Status"+ httpResp.status);
        location.replace('editor.html');
    }
        
  }
// for (let story of storyArr) {
//     let row = document.createElement('tr');
//     row.innerHTML = `
//         <td>${afullname}</td>
//         <td>${efullname}</td>
//         <td>${genre}</td>
//         <td>${title}</td>
//         <td>${description}</td>
//         <td>${storyLength}</td>
//         <th>storyLength</th> 
//     <th><button>approve</button>
//     <button>pending</button>
//     <button>rejected</button></th> 
//   </tr>  
//         `;
// storyTable.appendchild(row); 


// }





// async function checkLogin(){
// let credentials={
//     username:document.getElementById('email').value,
//     password:document.getElementById('password').value};
//    let credentialJSON=JSON.stringify(credentials);
//    let httpResp=await fetch('http://localhost:8081/person/'+, {
//        method:'POST', body:credentialJSON
//    });
//    if(httpResp && httpResp.status==200){
//        loggedInUser=await httpResp.json();
//        sessionStorage.setItem(loggedInUser.id);
//        await checkLogin();
//        loggedInNavBar();
//    }
// async function login(){
//     let credentials={
//         username:document.getElementById('email').value,
//         password:document.getElementById('password').value
//     };
//     let credentialJSON=JSON.stringify(credentials );
    
//     let httpResp=await fetch('http://localhost:8080/auth', {
//     method:'POST', body:credentialJSON
//     });
//     if(httpResp && httpResp.status===200){
//         loggedInUser = await httpResp.json();
//         seesionStorage.setItem('Auth-Token', loggedInUser,id);
//         await checkLogin();
//         loggedInNavBar();
//     }

//  }

//    function logOut(){
//        seesionStorage.removeItem('Auth-Token');
//        loggedInUser=null;
//        loggedOutNavBar();

//    }

//    function loggedOutNavBar(){
//        loginbtn=document.getElementById('loginbtn');
//        loginbtn.addEventListener('click',login)
//    }
