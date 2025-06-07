import React from 'react'
import { Link } from 'react-router-dom'


function Home() {
  return (
    <>
    <div className='pt-32 px-6 flex justify-between items-center' >
        <div className='flex flex-col text-center'>
        <h1 className='text-[40px] text-purple-600 uppercase'>Video call & Meeting for everyone</h1>
        <p className='text-base font-normal'>Connect,Collaborate from anywhere with Chroma Meet</p>
        <div className='py-8'>
        <Link to='/login'><button className='bg-purple-600 text-white px-4 py-2 rounded-2xl hover:bg-purple-700 transition'>Start Demo</button></Link>
        </div>
        </div>
       <div>
        
    <img src='https://street-smart.co.th/cms/wp-content/uploads/2021/05/image3.png'className='h-[500px]'/>
    </div>
    </div>

    </>
  )
}

export default Home