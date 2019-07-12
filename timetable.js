function checkbox(){
  
    var checkboxes = document.getElementsByName('skill');
    var checkboxesChecked = [];
    
    for (var i=0; i<checkboxes.length; i++) {
             if (checkboxes[i].checked) {
                checkboxesChecked.push(checkboxes[i].value);
       }
    }
    document.getElementById("skills").value = checkboxesChecked;
  
  }
  /*const subs = [
    {
        id : 1,
        name : 'Maths',
    },
    {
        id : 2,
        name : 'Physics',
    },
    {
        id : 3,
        name : 'Chemistry',
    },
    {
        id : 4,
        name : 'English',
    },
    {
        id : 5,
        name : 'Comp.Sci.',
    }
    {
        id : 6,
        name : 'Comp.Sci.',
    }
  ];*/

  const saveTrainer = () =>{
    console.log('Save Called');
    
    const tr = new TrainerSchedule();
    tr.setup(
        document.getElementById('tId').value,
        document.getElementById('tName').value,
        document.getElementById('tEmail').value,
        document.getElementById('skills').value
        );
    tr._add();
    fetchAllTrainer();
}

const fetchAllTrainer = ()=>{
    document.getElementById('tEmail').removeAttribute('readonly');
    const tr = new TrainerSchedule();
    const trainer = tr._all();
    buildTrainerTable(trainer);
    
}

const buildTrainerTable = (trainer) =>{
    const trBody = document.getElementById('tr-details');
    let rows = '';
    trainer.forEach((tr)=>{
        rows += `<tr>
                    <td>${tr.tId}</td>
                    <td>${tr.tName}</td>
                    <td>${tr.tEmail}</td>
                    <td>${tr.skills}</td>
                </tr>`
    });
    trBody.innerHTML = rows;
    if(rows !=''){
        document.getElementById('tbl-trainer').style.visibility = 'visible';
    }else{
        document.getElementById('tbl-trainer').style.visibility = 'hidden';
    }
}

class TrainerSchedule {
    tId
    tName
    tEmail
    skills

       setup(tId,tName,tEmail,skills){
            this.tId = tId
            this.tName = tName
            this.tEmail = tEmail
            this.skills = skills
    }

    

    _all(){
        const trainer= [];
        Object.keys(localStorage).forEach((storeKey)=>{
            trainer.push(JSON.parse(localStorage.getItem(storeKey)));
        });
        return trainer;
    }

    _add(){
        localStorage.setItem(this.tEmail,JSON.stringify({
            tId : this.tId,
            tName: this.tName,
            tEmail: this.tEmail,
            skills: this.skills
        }));
  }
}